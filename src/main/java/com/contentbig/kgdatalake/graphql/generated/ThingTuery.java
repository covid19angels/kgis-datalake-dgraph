// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* A Thing with an ID，在KGIS平�?�内所有内容都是东西Thing,也就是资��?Resource
*/
public class ThingTuery extends Tuery<ThingTuery> {
    ThingTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
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
    *     资��?对象所属的namespaces    
    */
    public ThingTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    *     资��?对象所属的namespaces    
    */
    public ThingTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    *     ��?标识符】 标识符 The identifier property represents any kind of identifier for any kind of Thing,
    * such as ISBNs, GTIN codes, UUIDs etc.    
    */
    public ThingTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    *     ��?�??称】name    Text    The name of the item.    
    */
    public ThingTuery name() {
        startField("name");

        return this;
    }

    /**
    *     ��?别�??】 该项的别�??。 An alias for the item.    
    */
    public ThingTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * ��?�??述】 该项的一个简�?��??述。 A description of the item.
    */
    public ThingTuery description() {
        startField("description");

        return this;
    }

    public ThingTuery onCart(CartTueryDefinition queryDef) {
        startInlineFragment("Cart");
        queryDef.define(new CartTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onCartItem(CartItemTueryDefinition queryDef) {
        startInlineFragment("CartItem");
        queryDef.define(new CartItemTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onCheckout(CheckoutTueryDefinition queryDef) {
        startInlineFragment("Checkout");
        queryDef.define(new CheckoutTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onCheckoutItem(CheckoutItemTueryDefinition queryDef) {
        startInlineFragment("CheckoutItem");
        queryDef.define(new CheckoutItemTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onConversation(ConversationTueryDefinition queryDef) {
        startInlineFragment("Conversation");
        queryDef.define(new ConversationTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onDataCatalog(DataCatalogTueryDefinition queryDef) {
        startInlineFragment("DataCatalog");
        queryDef.define(new DataCatalogTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onEmployeeRole(EmployeeRoleTueryDefinition queryDef) {
        startInlineFragment("EmployeeRole");
        queryDef.define(new EmployeeRoleTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onFollowerRole(FollowerRoleTueryDefinition queryDef) {
        startInlineFragment("FollowerRole");
        queryDef.define(new FollowerRoleTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onGeneralOrganization(GeneralOrganizationTueryDefinition queryDef) {
        startInlineFragment("GeneralOrganization");
        queryDef.define(new GeneralOrganizationTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onIssue(IssueTueryDefinition queryDef) {
        startInlineFragment("Issue");
        queryDef.define(new IssueTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onMemberRole(MemberRoleTueryDefinition queryDef) {
        startInlineFragment("MemberRole");
        queryDef.define(new MemberRoleTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onMessage(MessageTueryDefinition queryDef) {
        startInlineFragment("Message");
        queryDef.define(new MessageTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onNamespace(NamespaceTueryDefinition queryDef) {
        startInlineFragment("Namespace");
        queryDef.define(new NamespaceTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onOffer(OfferTueryDefinition queryDef) {
        startInlineFragment("Offer");
        queryDef.define(new OfferTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onOwnership(OwnershipTueryDefinition queryDef) {
        startInlineFragment("Ownership");
        queryDef.define(new OwnershipTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onPartyRoleName(PartyRoleNameTueryDefinition queryDef) {
        startInlineFragment("PartyRoleName");
        queryDef.define(new PartyRoleNameTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onPerson(PersonTueryDefinition queryDef) {
        startInlineFragment("Person");
        queryDef.define(new PersonTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onPoder(PoderTueryDefinition queryDef) {
        startInlineFragment("Poder");
        queryDef.define(new PoderTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onPoderItem(PoderItemTueryDefinition queryDef) {
        startInlineFragment("PoderItem");
        queryDef.define(new PoderItemTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onProduct(ProductTueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onProductModel(ProductModelTueryDefinition queryDef) {
        startInlineFragment("ProductModel");
        queryDef.define(new ProductModelTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onProject(ProjectTueryDefinition queryDef) {
        startInlineFragment("Project");
        queryDef.define(new ProjectTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onReadNote(ReadNoteTueryDefinition queryDef) {
        startInlineFragment("ReadNote");
        queryDef.define(new ReadNoteTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onReview(ReviewTueryDefinition queryDef) {
        startInlineFragment("Review");
        queryDef.define(new ReviewTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onSoftwareApplication(SoftwareApplicationTueryDefinition queryDef) {
        startInlineFragment("SoftwareApplication");
        queryDef.define(new SoftwareApplicationTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onStore(StoreTueryDefinition queryDef) {
        startInlineFragment("Store");
        queryDef.define(new StoreTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onTask(TaskTueryDefinition queryDef) {
        startInlineFragment("Task");
        queryDef.define(new TaskTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onTaskAssignment(TaskAssignmentTueryDefinition queryDef) {
        startInlineFragment("TaskAssignment");
        queryDef.define(new TaskAssignmentTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onUser(UserTueryDefinition queryDef) {
        startInlineFragment("User");
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingTuery onWebhook(WebhookTueryDefinition queryDef) {
        startInlineFragment("Webhook");
        queryDef.define(new WebhookTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
