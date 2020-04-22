package com.contentbig.kgdatalake.graphql;


import com.contentbig.kgdatalake.graphql.generated.Mutation;
import com.contentbig.kgdatalake.graphql.generated.MutationTuery;
import com.contentbig.kgdatalake.graphql.generated.Query;
import com.contentbig.kgdatalake.graphql.generated.QueryTuery;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Map;


public class KgqlClient {
    private HttpResponseParser httpResponseParser;

    private KgqlClient() {
        httpResponseParser = new HttpResponseParser();
    }

    private String url;
    private Map<String, String> headers;
    private OkHttpClient okHttpClient;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private static KgqlClient kgqlClient;

        private Builder() {
            kgqlClient = new KgqlClient();
        }

        public Builder setUrl(String url) {
            kgqlClient.url = url;
            return this;
        }

        public Builder setHttpClient(OkHttpClient client) {
            kgqlClient.okHttpClient = client;
            OkHttpUtils.getInstance().setClient(client);
            return this;
        }

        public Builder setHeaders(Map<String, String> headers) {
            kgqlClient.headers = headers;
            return this;
        }

        public KgqlClient build() {
            return kgqlClient;
        }
    }


    public Single<Query> queryGraph(final QueryTuery queryTuery) {

        return Single.create(new SingleOnSubscribe<Query>() {
            @Override
            public void subscribe(final SingleEmitter<Query> singleEmitter) throws Exception {

                String queryString = queryTuery.toString();
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("query", queryString);

                OkHttpUtils.doRequestBody(headers, url, jsonObject.toString(), new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        singleEmitter.onError(e);
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        try {
                            Query root = httpResponseParser.parseQuery(response);
                            singleEmitter.onSuccess(root);
                        } catch (Exception e) {
                            e.printStackTrace();
                            singleEmitter.onError(e);
                        }
                    }
                });
            }
        });
    }

    public Query queryGraphSynchronize(final QueryTuery queryRootQuery) throws Exception {
        String queryString = queryRootQuery.toString();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("query", queryString);
        Response response = OkHttpUtils.doRequestBody(headers, url, jsonObject.toString());
        return httpResponseParser.parseQuery(response);

    }

    public Mutation mutateGraphSynchronize(MutationTuery mutationQuery) throws Exception {
        String queryString = mutationQuery.toString();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("query", queryString);
        Response response = OkHttpUtils.doRequestBody(headers, url, jsonObject.toString());
        return httpResponseParser.parseMutation(response);
    }

    public Single<Mutation> mutateGraph(MutationTuery mutationQuery) {
        return Single.create(new SingleOnSubscribe<Mutation>() {
            @Override
            public void subscribe(SingleEmitter<Mutation> singleEmitter) throws Exception {

                String queryString = mutationQuery.toString();
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("query", queryString);

                OkHttpUtils.doRequestBody(headers, url, jsonObject.toString(), new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        singleEmitter.onError(e);
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {

                        try {
                            Mutation mutation = httpResponseParser.parseMutation(response);
                            singleEmitter.onSuccess(mutation);
                        } catch (Exception e) {
                            e.printStackTrace();
                            singleEmitter.onError(e);
                        }
                    }
                });
            }
        });
    }
}
