// Generated from graphql_java_gen gem with template Object.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* 
*/
public class Query extends AbstractResponse<Query> {
    public Query() {
    }

    public Query(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "getNode": {
                    Node optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownNode.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryNode": {
                    List<Node> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Node> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Node optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownNode.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryOrganization": {
                    List<Organization> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Organization> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Organization optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownOrganization.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryParty": {
                    List<Party> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Party> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Party optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownParty.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryPartyRole": {
                    List<PartyRole> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PartyRole> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            PartyRole optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownPartyRole.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryReadable": {
                    List<Readable> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Readable> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Readable optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownReadable.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "querySaleable": {
                    List<Saleable> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Saleable> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Saleable optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownSaleable.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryThing": {
                    List<Thing> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Thing> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Thing optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownThing.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getNamespace": {
                    Namespace optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Namespace(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryNamespace": {
                    List<Namespace> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Namespace> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Namespace optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Namespace(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getConversation": {
                    Conversation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Conversation(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryConversation": {
                    List<Conversation> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Conversation> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Conversation optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Conversation(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getDataCatalog": {
                    DataCatalog optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DataCatalog(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryDataCatalog": {
                    List<DataCatalog> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<DataCatalog> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            DataCatalog optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new DataCatalog(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getMessage": {
                    Message optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Message(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryMessage": {
                    List<Message> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Message> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Message optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Message(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getReadNote": {
                    ReadNote optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReadNote(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryReadNote": {
                    List<ReadNote> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ReadNote> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ReadNote optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ReadNote(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getReview": {
                    Review optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Review(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryReview": {
                    List<Review> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Review> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Review optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Review(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getEmployeeRole": {
                    EmployeeRole optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new EmployeeRole(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryEmployeeRole": {
                    List<EmployeeRole> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<EmployeeRole> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            EmployeeRole optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new EmployeeRole(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getFollowerRole": {
                    FollowerRole optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FollowerRole(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryFollowerRole": {
                    List<FollowerRole> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<FollowerRole> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            FollowerRole optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new FollowerRole(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getGeneralOrganization": {
                    GeneralOrganization optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GeneralOrganization(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryGeneralOrganization": {
                    List<GeneralOrganization> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<GeneralOrganization> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            GeneralOrganization optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new GeneralOrganization(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getMemberRole": {
                    MemberRole optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MemberRole(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryMemberRole": {
                    List<MemberRole> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<MemberRole> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            MemberRole optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new MemberRole(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getOwnership": {
                    Ownership optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Ownership(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryOwnership": {
                    List<Ownership> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Ownership> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Ownership optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Ownership(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getPartyRoleName": {
                    PartyRoleName optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PartyRoleName(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryPartyRoleName": {
                    List<PartyRoleName> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PartyRoleName> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            PartyRoleName optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new PartyRoleName(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getPerson": {
                    Person optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Person(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryPerson": {
                    List<Person> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Person> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Person optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Person(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getStore": {
                    Store optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Store(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryStore": {
                    List<Store> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Store> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Store optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Store(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getUser": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryUser": {
                    List<User> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<User> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            User optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new User(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getOffer": {
                    Offer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Offer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryOffer": {
                    List<Offer> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Offer> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Offer optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Offer(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getProduct": {
                    Product optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Product(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryProduct": {
                    List<Product> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Product> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Product optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Product(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getProductModel": {
                    ProductModel optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductModel(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryProductModel": {
                    List<ProductModel> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ProductModel> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ProductModel optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ProductModel(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getCart": {
                    Cart optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Cart(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryCart": {
                    List<Cart> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Cart> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Cart optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Cart(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getCartItem": {
                    CartItem optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CartItem(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryCartItem": {
                    List<CartItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CartItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CartItem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CartItem(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getCheckout": {
                    Checkout optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Checkout(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryCheckout": {
                    List<Checkout> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Checkout> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Checkout optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Checkout(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getCheckoutItem": {
                    CheckoutItem optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutItem(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryCheckoutItem": {
                    List<CheckoutItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CheckoutItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CheckoutItem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CheckoutItem(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getPoder": {
                    Poder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Poder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryPoder": {
                    List<Poder> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Poder> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Poder optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Poder(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getPoderItem": {
                    PoderItem optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PoderItem(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryPoderItem": {
                    List<PoderItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PoderItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            PoderItem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new PoderItem(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getSoftwareApplication": {
                    SoftwareApplication optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SoftwareApplication(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "querySoftwareApplication": {
                    List<SoftwareApplication> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<SoftwareApplication> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            SoftwareApplication optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new SoftwareApplication(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getWebhook": {
                    Webhook optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Webhook(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryWebhook": {
                    List<Webhook> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Webhook> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Webhook optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Webhook(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getIssue": {
                    Issue optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Issue(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryIssue": {
                    List<Issue> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Issue> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Issue optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Issue(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getProject": {
                    Project optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Project(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryProject": {
                    List<Project> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Project> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Project optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Project(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getTask": {
                    Task optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Task(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryTask": {
                    List<Task> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Task> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Task optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Task(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getTaskAssignment": {
                    TaskAssignment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new TaskAssignment(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryTaskAssignment": {
                    List<TaskAssignment> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<TaskAssignment> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            TaskAssignment optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new TaskAssignment(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "Query";
    }

    /**
    * 
    */

    public Node getGetNode() {
        return (Node) get("getNode");
    }

    public Query setGetNode(Node arg) {
        optimisticData.put(getKey("getNode"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Node> getQueryNode() {
        return (List<Node>) get("queryNode");
    }

    public Query setQueryNode(List<Node> arg) {
        optimisticData.put(getKey("queryNode"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Organization> getQueryOrganization() {
        return (List<Organization>) get("queryOrganization");
    }

    public Query setQueryOrganization(List<Organization> arg) {
        optimisticData.put(getKey("queryOrganization"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Party> getQueryParty() {
        return (List<Party>) get("queryParty");
    }

    public Query setQueryParty(List<Party> arg) {
        optimisticData.put(getKey("queryParty"), arg);
        return this;
    }

    /**
    * 
    */

    public List<PartyRole> getQueryPartyRole() {
        return (List<PartyRole>) get("queryPartyRole");
    }

    public Query setQueryPartyRole(List<PartyRole> arg) {
        optimisticData.put(getKey("queryPartyRole"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Readable> getQueryReadable() {
        return (List<Readable>) get("queryReadable");
    }

    public Query setQueryReadable(List<Readable> arg) {
        optimisticData.put(getKey("queryReadable"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Saleable> getQuerySaleable() {
        return (List<Saleable>) get("querySaleable");
    }

    public Query setQuerySaleable(List<Saleable> arg) {
        optimisticData.put(getKey("querySaleable"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Thing> getQueryThing() {
        return (List<Thing>) get("queryThing");
    }

    public Query setQueryThing(List<Thing> arg) {
        optimisticData.put(getKey("queryThing"), arg);
        return this;
    }

    /**
    * 
    */

    public Namespace getGetNamespace() {
        return (Namespace) get("getNamespace");
    }

    public Query setGetNamespace(Namespace arg) {
        optimisticData.put(getKey("getNamespace"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Namespace> getQueryNamespace() {
        return (List<Namespace>) get("queryNamespace");
    }

    public Query setQueryNamespace(List<Namespace> arg) {
        optimisticData.put(getKey("queryNamespace"), arg);
        return this;
    }

    /**
    * 
    */

    public Conversation getGetConversation() {
        return (Conversation) get("getConversation");
    }

    public Query setGetConversation(Conversation arg) {
        optimisticData.put(getKey("getConversation"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Conversation> getQueryConversation() {
        return (List<Conversation>) get("queryConversation");
    }

    public Query setQueryConversation(List<Conversation> arg) {
        optimisticData.put(getKey("queryConversation"), arg);
        return this;
    }

    /**
    * 
    */

    public DataCatalog getGetDataCatalog() {
        return (DataCatalog) get("getDataCatalog");
    }

    public Query setGetDataCatalog(DataCatalog arg) {
        optimisticData.put(getKey("getDataCatalog"), arg);
        return this;
    }

    /**
    * 
    */

    public List<DataCatalog> getQueryDataCatalog() {
        return (List<DataCatalog>) get("queryDataCatalog");
    }

    public Query setQueryDataCatalog(List<DataCatalog> arg) {
        optimisticData.put(getKey("queryDataCatalog"), arg);
        return this;
    }

    /**
    * 
    */

    public Message getGetMessage() {
        return (Message) get("getMessage");
    }

    public Query setGetMessage(Message arg) {
        optimisticData.put(getKey("getMessage"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Message> getQueryMessage() {
        return (List<Message>) get("queryMessage");
    }

    public Query setQueryMessage(List<Message> arg) {
        optimisticData.put(getKey("queryMessage"), arg);
        return this;
    }

    /**
    * 
    */

    public ReadNote getGetReadNote() {
        return (ReadNote) get("getReadNote");
    }

    public Query setGetReadNote(ReadNote arg) {
        optimisticData.put(getKey("getReadNote"), arg);
        return this;
    }

    /**
    * 
    */

    public List<ReadNote> getQueryReadNote() {
        return (List<ReadNote>) get("queryReadNote");
    }

    public Query setQueryReadNote(List<ReadNote> arg) {
        optimisticData.put(getKey("queryReadNote"), arg);
        return this;
    }

    /**
    * 
    */

    public Review getGetReview() {
        return (Review) get("getReview");
    }

    public Query setGetReview(Review arg) {
        optimisticData.put(getKey("getReview"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Review> getQueryReview() {
        return (List<Review>) get("queryReview");
    }

    public Query setQueryReview(List<Review> arg) {
        optimisticData.put(getKey("queryReview"), arg);
        return this;
    }

    /**
    * 
    */

    public EmployeeRole getGetEmployeeRole() {
        return (EmployeeRole) get("getEmployeeRole");
    }

    public Query setGetEmployeeRole(EmployeeRole arg) {
        optimisticData.put(getKey("getEmployeeRole"), arg);
        return this;
    }

    /**
    * 
    */

    public List<EmployeeRole> getQueryEmployeeRole() {
        return (List<EmployeeRole>) get("queryEmployeeRole");
    }

    public Query setQueryEmployeeRole(List<EmployeeRole> arg) {
        optimisticData.put(getKey("queryEmployeeRole"), arg);
        return this;
    }

    /**
    * 
    */

    public FollowerRole getGetFollowerRole() {
        return (FollowerRole) get("getFollowerRole");
    }

    public Query setGetFollowerRole(FollowerRole arg) {
        optimisticData.put(getKey("getFollowerRole"), arg);
        return this;
    }

    /**
    * 
    */

    public List<FollowerRole> getQueryFollowerRole() {
        return (List<FollowerRole>) get("queryFollowerRole");
    }

    public Query setQueryFollowerRole(List<FollowerRole> arg) {
        optimisticData.put(getKey("queryFollowerRole"), arg);
        return this;
    }

    /**
    * 
    */

    public GeneralOrganization getGetGeneralOrganization() {
        return (GeneralOrganization) get("getGeneralOrganization");
    }

    public Query setGetGeneralOrganization(GeneralOrganization arg) {
        optimisticData.put(getKey("getGeneralOrganization"), arg);
        return this;
    }

    /**
    * 
    */

    public List<GeneralOrganization> getQueryGeneralOrganization() {
        return (List<GeneralOrganization>) get("queryGeneralOrganization");
    }

    public Query setQueryGeneralOrganization(List<GeneralOrganization> arg) {
        optimisticData.put(getKey("queryGeneralOrganization"), arg);
        return this;
    }

    /**
    * 
    */

    public MemberRole getGetMemberRole() {
        return (MemberRole) get("getMemberRole");
    }

    public Query setGetMemberRole(MemberRole arg) {
        optimisticData.put(getKey("getMemberRole"), arg);
        return this;
    }

    /**
    * 
    */

    public List<MemberRole> getQueryMemberRole() {
        return (List<MemberRole>) get("queryMemberRole");
    }

    public Query setQueryMemberRole(List<MemberRole> arg) {
        optimisticData.put(getKey("queryMemberRole"), arg);
        return this;
    }

    /**
    * 
    */

    public Ownership getGetOwnership() {
        return (Ownership) get("getOwnership");
    }

    public Query setGetOwnership(Ownership arg) {
        optimisticData.put(getKey("getOwnership"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Ownership> getQueryOwnership() {
        return (List<Ownership>) get("queryOwnership");
    }

    public Query setQueryOwnership(List<Ownership> arg) {
        optimisticData.put(getKey("queryOwnership"), arg);
        return this;
    }

    /**
    * 
    */

    public PartyRoleName getGetPartyRoleName() {
        return (PartyRoleName) get("getPartyRoleName");
    }

    public Query setGetPartyRoleName(PartyRoleName arg) {
        optimisticData.put(getKey("getPartyRoleName"), arg);
        return this;
    }

    /**
    * 
    */

    public List<PartyRoleName> getQueryPartyRoleName() {
        return (List<PartyRoleName>) get("queryPartyRoleName");
    }

    public Query setQueryPartyRoleName(List<PartyRoleName> arg) {
        optimisticData.put(getKey("queryPartyRoleName"), arg);
        return this;
    }

    /**
    * 
    */

    public Person getGetPerson() {
        return (Person) get("getPerson");
    }

    public Query setGetPerson(Person arg) {
        optimisticData.put(getKey("getPerson"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Person> getQueryPerson() {
        return (List<Person>) get("queryPerson");
    }

    public Query setQueryPerson(List<Person> arg) {
        optimisticData.put(getKey("queryPerson"), arg);
        return this;
    }

    /**
    * 
    */

    public Store getGetStore() {
        return (Store) get("getStore");
    }

    public Query setGetStore(Store arg) {
        optimisticData.put(getKey("getStore"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Store> getQueryStore() {
        return (List<Store>) get("queryStore");
    }

    public Query setQueryStore(List<Store> arg) {
        optimisticData.put(getKey("queryStore"), arg);
        return this;
    }

    /**
    * 
    */

    public User getGetUser() {
        return (User) get("getUser");
    }

    public Query setGetUser(User arg) {
        optimisticData.put(getKey("getUser"), arg);
        return this;
    }

    /**
    * 
    */

    public List<User> getQueryUser() {
        return (List<User>) get("queryUser");
    }

    public Query setQueryUser(List<User> arg) {
        optimisticData.put(getKey("queryUser"), arg);
        return this;
    }

    /**
    * 
    */

    public Offer getGetOffer() {
        return (Offer) get("getOffer");
    }

    public Query setGetOffer(Offer arg) {
        optimisticData.put(getKey("getOffer"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Offer> getQueryOffer() {
        return (List<Offer>) get("queryOffer");
    }

    public Query setQueryOffer(List<Offer> arg) {
        optimisticData.put(getKey("queryOffer"), arg);
        return this;
    }

    /**
    * 
    */

    public Product getGetProduct() {
        return (Product) get("getProduct");
    }

    public Query setGetProduct(Product arg) {
        optimisticData.put(getKey("getProduct"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Product> getQueryProduct() {
        return (List<Product>) get("queryProduct");
    }

    public Query setQueryProduct(List<Product> arg) {
        optimisticData.put(getKey("queryProduct"), arg);
        return this;
    }

    /**
    * 
    */

    public ProductModel getGetProductModel() {
        return (ProductModel) get("getProductModel");
    }

    public Query setGetProductModel(ProductModel arg) {
        optimisticData.put(getKey("getProductModel"), arg);
        return this;
    }

    /**
    * 
    */

    public List<ProductModel> getQueryProductModel() {
        return (List<ProductModel>) get("queryProductModel");
    }

    public Query setQueryProductModel(List<ProductModel> arg) {
        optimisticData.put(getKey("queryProductModel"), arg);
        return this;
    }

    /**
    * 
    */

    public Cart getGetCart() {
        return (Cart) get("getCart");
    }

    public Query setGetCart(Cart arg) {
        optimisticData.put(getKey("getCart"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Cart> getQueryCart() {
        return (List<Cart>) get("queryCart");
    }

    public Query setQueryCart(List<Cart> arg) {
        optimisticData.put(getKey("queryCart"), arg);
        return this;
    }

    /**
    * 
    */

    public CartItem getGetCartItem() {
        return (CartItem) get("getCartItem");
    }

    public Query setGetCartItem(CartItem arg) {
        optimisticData.put(getKey("getCartItem"), arg);
        return this;
    }

    /**
    * 
    */

    public List<CartItem> getQueryCartItem() {
        return (List<CartItem>) get("queryCartItem");
    }

    public Query setQueryCartItem(List<CartItem> arg) {
        optimisticData.put(getKey("queryCartItem"), arg);
        return this;
    }

    /**
    * 
    */

    public Checkout getGetCheckout() {
        return (Checkout) get("getCheckout");
    }

    public Query setGetCheckout(Checkout arg) {
        optimisticData.put(getKey("getCheckout"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Checkout> getQueryCheckout() {
        return (List<Checkout>) get("queryCheckout");
    }

    public Query setQueryCheckout(List<Checkout> arg) {
        optimisticData.put(getKey("queryCheckout"), arg);
        return this;
    }

    /**
    * 
    */

    public CheckoutItem getGetCheckoutItem() {
        return (CheckoutItem) get("getCheckoutItem");
    }

    public Query setGetCheckoutItem(CheckoutItem arg) {
        optimisticData.put(getKey("getCheckoutItem"), arg);
        return this;
    }

    /**
    * 
    */

    public List<CheckoutItem> getQueryCheckoutItem() {
        return (List<CheckoutItem>) get("queryCheckoutItem");
    }

    public Query setQueryCheckoutItem(List<CheckoutItem> arg) {
        optimisticData.put(getKey("queryCheckoutItem"), arg);
        return this;
    }

    /**
    * 
    */

    public Poder getGetPoder() {
        return (Poder) get("getPoder");
    }

    public Query setGetPoder(Poder arg) {
        optimisticData.put(getKey("getPoder"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Poder> getQueryPoder() {
        return (List<Poder>) get("queryPoder");
    }

    public Query setQueryPoder(List<Poder> arg) {
        optimisticData.put(getKey("queryPoder"), arg);
        return this;
    }

    /**
    * 
    */

    public PoderItem getGetPoderItem() {
        return (PoderItem) get("getPoderItem");
    }

    public Query setGetPoderItem(PoderItem arg) {
        optimisticData.put(getKey("getPoderItem"), arg);
        return this;
    }

    /**
    * 
    */

    public List<PoderItem> getQueryPoderItem() {
        return (List<PoderItem>) get("queryPoderItem");
    }

    public Query setQueryPoderItem(List<PoderItem> arg) {
        optimisticData.put(getKey("queryPoderItem"), arg);
        return this;
    }

    /**
    * 
    */

    public SoftwareApplication getGetSoftwareApplication() {
        return (SoftwareApplication) get("getSoftwareApplication");
    }

    public Query setGetSoftwareApplication(SoftwareApplication arg) {
        optimisticData.put(getKey("getSoftwareApplication"), arg);
        return this;
    }

    /**
    * 
    */

    public List<SoftwareApplication> getQuerySoftwareApplication() {
        return (List<SoftwareApplication>) get("querySoftwareApplication");
    }

    public Query setQuerySoftwareApplication(List<SoftwareApplication> arg) {
        optimisticData.put(getKey("querySoftwareApplication"), arg);
        return this;
    }

    /**
    * 
    */

    public Webhook getGetWebhook() {
        return (Webhook) get("getWebhook");
    }

    public Query setGetWebhook(Webhook arg) {
        optimisticData.put(getKey("getWebhook"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Webhook> getQueryWebhook() {
        return (List<Webhook>) get("queryWebhook");
    }

    public Query setQueryWebhook(List<Webhook> arg) {
        optimisticData.put(getKey("queryWebhook"), arg);
        return this;
    }

    /**
    * 
    */

    public Issue getGetIssue() {
        return (Issue) get("getIssue");
    }

    public Query setGetIssue(Issue arg) {
        optimisticData.put(getKey("getIssue"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Issue> getQueryIssue() {
        return (List<Issue>) get("queryIssue");
    }

    public Query setQueryIssue(List<Issue> arg) {
        optimisticData.put(getKey("queryIssue"), arg);
        return this;
    }

    /**
    * 
    */

    public Project getGetProject() {
        return (Project) get("getProject");
    }

    public Query setGetProject(Project arg) {
        optimisticData.put(getKey("getProject"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Project> getQueryProject() {
        return (List<Project>) get("queryProject");
    }

    public Query setQueryProject(List<Project> arg) {
        optimisticData.put(getKey("queryProject"), arg);
        return this;
    }

    /**
    * 
    */

    public Task getGetTask() {
        return (Task) get("getTask");
    }

    public Query setGetTask(Task arg) {
        optimisticData.put(getKey("getTask"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Task> getQueryTask() {
        return (List<Task>) get("queryTask");
    }

    public Query setQueryTask(List<Task> arg) {
        optimisticData.put(getKey("queryTask"), arg);
        return this;
    }

    /**
    * 
    */

    public TaskAssignment getGetTaskAssignment() {
        return (TaskAssignment) get("getTaskAssignment");
    }

    public Query setGetTaskAssignment(TaskAssignment arg) {
        optimisticData.put(getKey("getTaskAssignment"), arg);
        return this;
    }

    /**
    * 
    */

    public List<TaskAssignment> getQueryTaskAssignment() {
        return (List<TaskAssignment>) get("queryTaskAssignment");
    }

    public Query setQueryTaskAssignment(List<TaskAssignment> arg) {
        optimisticData.put(getKey("queryTaskAssignment"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "getNode": return false;

            case "queryNode": return false;

            case "queryOrganization": return false;

            case "queryParty": return false;

            case "queryPartyRole": return false;

            case "queryReadable": return false;

            case "querySaleable": return false;

            case "queryThing": return false;

            case "getNamespace": return true;

            case "queryNamespace": return true;

            case "getConversation": return true;

            case "queryConversation": return true;

            case "getDataCatalog": return true;

            case "queryDataCatalog": return true;

            case "getMessage": return true;

            case "queryMessage": return true;

            case "getReadNote": return true;

            case "queryReadNote": return true;

            case "getReview": return true;

            case "queryReview": return true;

            case "getEmployeeRole": return true;

            case "queryEmployeeRole": return true;

            case "getFollowerRole": return true;

            case "queryFollowerRole": return true;

            case "getGeneralOrganization": return true;

            case "queryGeneralOrganization": return true;

            case "getMemberRole": return true;

            case "queryMemberRole": return true;

            case "getOwnership": return true;

            case "queryOwnership": return true;

            case "getPartyRoleName": return true;

            case "queryPartyRoleName": return true;

            case "getPerson": return true;

            case "queryPerson": return true;

            case "getStore": return true;

            case "queryStore": return true;

            case "getUser": return true;

            case "queryUser": return true;

            case "getOffer": return true;

            case "queryOffer": return true;

            case "getProduct": return true;

            case "queryProduct": return true;

            case "getProductModel": return true;

            case "queryProductModel": return true;

            case "getCart": return true;

            case "queryCart": return true;

            case "getCartItem": return true;

            case "queryCartItem": return true;

            case "getCheckout": return true;

            case "queryCheckout": return true;

            case "getCheckoutItem": return true;

            case "queryCheckoutItem": return true;

            case "getPoder": return true;

            case "queryPoder": return true;

            case "getPoderItem": return true;

            case "queryPoderItem": return true;

            case "getSoftwareApplication": return true;

            case "querySoftwareApplication": return true;

            case "getWebhook": return true;

            case "queryWebhook": return true;

            case "getIssue": return true;

            case "queryIssue": return true;

            case "getProject": return true;

            case "queryProject": return true;

            case "getTask": return true;

            case "queryTask": return true;

            case "getTaskAssignment": return true;

            case "queryTaskAssignment": return true;

            default: return false;
        }
    }
}

