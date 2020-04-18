// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.dgraph.graphql;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.Utils;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* ï¿½ï¿½?æ¶ˆï¿½?ï¿½ã€‘ç”±ï¿½?ï¿½ï¿½ï¿½?è€…ï¿½?ï¿½ç»™ä¸€ä¸ªæˆ–å¤šä¸ªç»„ç»‡æˆ–ä¸ªäººçš„ä¿¡ï¿½?ï¿½ A
* single message from a sender to one or more organizations or people.
*/
public class MessageTuery extends Tuery<MessageTuery> {
    MessageTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class HasReadNotesArguments extends Arguments {
        HasReadNotesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasReadNotesArguments filter(ReadNoteFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasReadNotesArguments order(ReadNoteOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasReadNotesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasReadNotesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasReadNotesArgumentsDefinition {
        void define(HasReadNotesArguments args);
    }

    /**
    * 
    */
    public MessageTuery hasReadNotes(ReadNoteTueryDefinition queryDef) {
        return hasReadNotes(args -> {}, queryDef);
    }

    /**
    * 
    */
    public MessageTuery hasReadNotes(HasReadNotesArgumentsDefinition argsDef, ReadNoteTueryDefinition queryDef) {
        startField("hasReadNotes");

        HasReadNotesArguments args = new HasReadNotesArguments(_queryBuilder);
        argsDef.define(args);
        HasReadNotesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReadNoteTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class NamespacesArguments extends Arguments {
        NamespacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public NamespacesArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface NamespacesArgumentsDefinition {
        void define(NamespacesArguments args);
    }

    /**
    * 
    */
    public MessageTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public MessageTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
        startField("namespaces");

        NamespacesArguments args = new NamespacesArguments(_queryBuilder);
        argsDef.define(args);
        NamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MessageTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public MessageTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public MessageTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public MessageTuery description() {
        startField("description");

        return this;
    }

    public class IsMessageOfArguments extends Arguments {
        IsMessageOfArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public IsMessageOfArguments filter(ConversationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public IsMessageOfArguments order(ConversationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public IsMessageOfArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public IsMessageOfArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface IsMessageOfArgumentsDefinition {
        void define(IsMessageOfArguments args);
    }

    /**
    *     ï¿½?ï¿½ç…§isPartOfï¿½ï¿½?ä»Žå±žäºŽã€‘ æ˜¯å®ƒçš„ä¸€éƒ¨åˆ† Indicates an item or CreativeWork that
    * this item, or CreativeWork (in some sense), is part of.    
    */
    public MessageTuery isMessageOf(ConversationTueryDefinition queryDef) {
        return isMessageOf(args -> {}, queryDef);
    }

    /**
    *     ï¿½?ï¿½ç…§isPartOfï¿½ï¿½?ä»Žå±žäºŽã€‘ æ˜¯å®ƒçš„ä¸€éƒ¨åˆ† Indicates an item or CreativeWork that
    * this item, or CreativeWork (in some sense), is part of.    
    */
    public MessageTuery isMessageOf(IsMessageOfArgumentsDefinition argsDef, ConversationTueryDefinition queryDef) {
        startField("isMessageOf");

        IsMessageOfArguments args = new IsMessageOfArguments(_queryBuilder);
        argsDef.define(args);
        IsMessageOfArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ConversationTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SenderArguments extends Arguments {
        SenderArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SenderArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface SenderArgumentsDefinition {
        void define(SenderArguments args);
    }

    /**
    *     ï¿½ï¿½?ï¿½?ï¿½ï¿½ï¿½?è€…ã€‘ ï¿½?ï¿½ä¸Žè€…çš„ï¿½ï¿½?å±žæ€§ã€‚ä¾‹å¦‚é‚®ä»¶çš„ï¿½?ï¿½ï¿½ï¿½?è€…ã€‚
    * A sub property of participant. The participant who is at the sending end of the action.    
    */
    public MessageTuery sender(UserTueryDefinition queryDef) {
        return sender(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?ï¿½?ï¿½ï¿½ï¿½?è€…ã€‘ ï¿½?ï¿½ä¸Žè€…çš„ï¿½ï¿½?å±žæ€§ã€‚ä¾‹å¦‚é‚®ä»¶çš„ï¿½?ï¿½ï¿½ï¿½?è€…ã€‚
    * A sub property of participant. The participant who is at the sending end of the action.    
    */
    public MessageTuery sender(SenderArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("sender");

        SenderArguments args = new SenderArguments(_queryBuilder);
        argsDef.define(args);
        SenderArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ï¿½ï¿½?ï¿½?ï¿½ï¿½ï¿½?æ—¥æœŸã€‘ æ¶ˆï¿½?ï¿½è¢«ï¿½?ï¿½ï¿½ï¿½?çš„æ—¥æœŸ/æ—¶é—´ã€‚ The date/time at
    * which the message was sent.    
    */
    public MessageTuery dateSent() {
        startField("dateSent");

        return this;
    }

    public class ToRecipientArguments extends Arguments {
        ToRecipientArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ToRecipientArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ToRecipientArgumentsDefinition {
        void define(ToRecipientArguments args);
    }

    /**
    *     ï¿½ï¿½?æ”¶ä»¶äººã€‘ æ¶ˆï¿½?ï¿½çš„ç›´æŽ¥æ”¶ä»¶äºº A sub property of recipient. The recipient who
    * was directly sent the message.    
    */
    public MessageTuery toRecipient(UserTueryDefinition queryDef) {
        return toRecipient(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?æ”¶ä»¶äººã€‘ æ¶ˆï¿½?ï¿½çš„ç›´æŽ¥æ”¶ä»¶äºº A sub property of recipient. The recipient who
    * was directly sent the message.    
    */
    public MessageTuery toRecipient(ToRecipientArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("toRecipient");

        ToRecipientArguments args = new ToRecipientArguments(_queryBuilder);
        argsDef.define(args);
        ToRecipientArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ï¿½ï¿½?é˜…è¯»æ—¥æœŸã€‘
    * å¦‚æžœå­˜åœ¨ï¿½?ï¿½ä¸ªçš„æ”¶ä»¶äººï¼Œå°±æ˜¯æ¶ˆï¿½?ï¿½è¢«æ”¶ä»¶äººè¯»ï¿½?ï¿½çš„æ—¥æœŸ/æ—¶é—´ã€‚ The
    * date/time at which the message has been read by the recipient if a single recipient exists.    
    */
    public MessageTuery dateRead() {
        startField("dateRead");

        return this;
    }

    /**
    *     ï¿½ï¿½?æŽ¥æ”¶æ—¥æœŸã€‘
    * å¦‚æžœå­˜åœ¨ï¿½?ï¿½ä¸ªçš„æ”¶ä»¶äººï¼Œå°±æ˜¯æ¶ˆï¿½?ï¿½è¢«æ”¶ä»¶äººæŽ¥æ”¶çš„æ—¥æœŸ/æ—¶é—´ã€‚ The
    * date/time the message was received if a single recipient exists.    
    */
    public MessageTuery dateReceived() {
        startField("dateReceived");

        return this;
    }

    public class RecipientArguments extends Arguments {
        RecipientArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public RecipientArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RecipientArguments order(UserOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public RecipientArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public RecipientArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface RecipientArgumentsDefinition {
        void define(RecipientArguments args);
    }

    /**
    *     ï¿½ï¿½?æŽ¥æ”¶è€…ã€‘ ï¿½?ï¿½ä¸Žè€…çš„ï¿½ï¿½?å±žæ€§ã€‚ åœ¨è¡ŒåŠ¨æŽ¥æ”¶ç«¯çš„ï¿½?ï¿½ä¸Žè€…ã€‚ A sub
    * property of participant. The participant who is at the receiving end of the action.    
    */
    public MessageTuery recipient(UserTueryDefinition queryDef) {
        return recipient(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?æŽ¥æ”¶è€…ã€‘ ï¿½?ï¿½ä¸Žè€…çš„ï¿½ï¿½?å±žæ€§ã€‚ åœ¨è¡ŒåŠ¨æŽ¥æ”¶ç«¯çš„ï¿½?ï¿½ä¸Žè€…ã€‚ A sub
    * property of participant. The participant who is at the receiving end of the action.    
    */
    public MessageTuery recipient(RecipientArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("recipient");

        RecipientArguments args = new RecipientArguments(_queryBuilder);
        argsDef.define(args);
        RecipientArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class HasReviewsArguments extends Arguments {
        HasReviewsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasReviewsArguments filter(ReviewFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasReviewsArguments order(ReviewOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasReviewsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasReviewsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasReviewsArgumentsDefinition {
        void define(HasReviewsArguments args);
    }

    /**
    *     ï¿½ï¿½?è¯„è®ºã€‘ è¯„è®ºï¼Œä¸€èˆ¬æ˜¯ç”¨æˆ·å¯¹CreativeWorkçš„è¯„è®ºã€‚    
    */
    public MessageTuery hasReviews(ReviewTueryDefinition queryDef) {
        return hasReviews(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?è¯„è®ºã€‘ è¯„è®ºï¼Œä¸€èˆ¬æ˜¯ç”¨æˆ·å¯¹CreativeWorkçš„è¯„è®ºã€‚    
    */
    public MessageTuery hasReviews(HasReviewsArgumentsDefinition argsDef, ReviewTueryDefinition queryDef) {
        startField("hasReviews");

        HasReviewsArguments args = new HasReviewsArguments(_queryBuilder);
        argsDef.define(args);
        HasReviewsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReviewTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
