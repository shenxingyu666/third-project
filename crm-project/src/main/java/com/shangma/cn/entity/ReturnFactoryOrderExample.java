package com.shangma.cn.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReturnFactoryOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReturnFactoryOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressIsNull() {
            addCriterion("factory_address is null");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressIsNotNull() {
            addCriterion("factory_address is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressEqualTo(String value) {
            addCriterion("factory_address =", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressNotEqualTo(String value) {
            addCriterion("factory_address <>", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressGreaterThan(String value) {
            addCriterion("factory_address >", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("factory_address >=", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressLessThan(String value) {
            addCriterion("factory_address <", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressLessThanOrEqualTo(String value) {
            addCriterion("factory_address <=", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressLike(String value) {
            addCriterion("factory_address like", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressNotLike(String value) {
            addCriterion("factory_address not like", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressIn(List<String> values) {
            addCriterion("factory_address in", values, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressNotIn(List<String> values) {
            addCriterion("factory_address not in", values, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressBetween(String value1, String value2) {
            addCriterion("factory_address between", value1, value2, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressNotBetween(String value1, String value2) {
            addCriterion("factory_address not between", value1, value2, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFixReasonIsNull() {
            addCriterion("fix_reason is null");
            return (Criteria) this;
        }

        public Criteria andFixReasonIsNotNull() {
            addCriterion("fix_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFixReasonEqualTo(String value) {
            addCriterion("fix_reason =", value, "fixReason");
            return (Criteria) this;
        }

        public Criteria andFixReasonNotEqualTo(String value) {
            addCriterion("fix_reason <>", value, "fixReason");
            return (Criteria) this;
        }

        public Criteria andFixReasonGreaterThan(String value) {
            addCriterion("fix_reason >", value, "fixReason");
            return (Criteria) this;
        }

        public Criteria andFixReasonGreaterThanOrEqualTo(String value) {
            addCriterion("fix_reason >=", value, "fixReason");
            return (Criteria) this;
        }

        public Criteria andFixReasonLessThan(String value) {
            addCriterion("fix_reason <", value, "fixReason");
            return (Criteria) this;
        }

        public Criteria andFixReasonLessThanOrEqualTo(String value) {
            addCriterion("fix_reason <=", value, "fixReason");
            return (Criteria) this;
        }

        public Criteria andFixReasonLike(String value) {
            addCriterion("fix_reason like", value, "fixReason");
            return (Criteria) this;
        }

        public Criteria andFixReasonNotLike(String value) {
            addCriterion("fix_reason not like", value, "fixReason");
            return (Criteria) this;
        }

        public Criteria andFixReasonIn(List<String> values) {
            addCriterion("fix_reason in", values, "fixReason");
            return (Criteria) this;
        }

        public Criteria andFixReasonNotIn(List<String> values) {
            addCriterion("fix_reason not in", values, "fixReason");
            return (Criteria) this;
        }

        public Criteria andFixReasonBetween(String value1, String value2) {
            addCriterion("fix_reason between", value1, value2, "fixReason");
            return (Criteria) this;
        }

        public Criteria andFixReasonNotBetween(String value1, String value2) {
            addCriterion("fix_reason not between", value1, value2, "fixReason");
            return (Criteria) this;
        }

        public Criteria andIoStatusIsNull() {
            addCriterion("io_status is null");
            return (Criteria) this;
        }

        public Criteria andIoStatusIsNotNull() {
            addCriterion("io_status is not null");
            return (Criteria) this;
        }

        public Criteria andIoStatusEqualTo(String value) {
            addCriterion("io_status =", value, "ioStatus");
            return (Criteria) this;
        }

        public Criteria andIoStatusNotEqualTo(String value) {
            addCriterion("io_status <>", value, "ioStatus");
            return (Criteria) this;
        }

        public Criteria andIoStatusGreaterThan(String value) {
            addCriterion("io_status >", value, "ioStatus");
            return (Criteria) this;
        }

        public Criteria andIoStatusGreaterThanOrEqualTo(String value) {
            addCriterion("io_status >=", value, "ioStatus");
            return (Criteria) this;
        }

        public Criteria andIoStatusLessThan(String value) {
            addCriterion("io_status <", value, "ioStatus");
            return (Criteria) this;
        }

        public Criteria andIoStatusLessThanOrEqualTo(String value) {
            addCriterion("io_status <=", value, "ioStatus");
            return (Criteria) this;
        }

        public Criteria andIoStatusLike(String value) {
            addCriterion("io_status like", value, "ioStatus");
            return (Criteria) this;
        }

        public Criteria andIoStatusNotLike(String value) {
            addCriterion("io_status not like", value, "ioStatus");
            return (Criteria) this;
        }

        public Criteria andIoStatusIn(List<String> values) {
            addCriterion("io_status in", values, "ioStatus");
            return (Criteria) this;
        }

        public Criteria andIoStatusNotIn(List<String> values) {
            addCriterion("io_status not in", values, "ioStatus");
            return (Criteria) this;
        }

        public Criteria andIoStatusBetween(String value1, String value2) {
            addCriterion("io_status between", value1, value2, "ioStatus");
            return (Criteria) this;
        }

        public Criteria andIoStatusNotBetween(String value1, String value2) {
            addCriterion("io_status not between", value1, value2, "ioStatus");
            return (Criteria) this;
        }

        public Criteria andOtherDescIsNull() {
            addCriterion("other_desc is null");
            return (Criteria) this;
        }

        public Criteria andOtherDescIsNotNull() {
            addCriterion("other_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOtherDescEqualTo(String value) {
            addCriterion("other_desc =", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescNotEqualTo(String value) {
            addCriterion("other_desc <>", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescGreaterThan(String value) {
            addCriterion("other_desc >", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescGreaterThanOrEqualTo(String value) {
            addCriterion("other_desc >=", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescLessThan(String value) {
            addCriterion("other_desc <", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescLessThanOrEqualTo(String value) {
            addCriterion("other_desc <=", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescLike(String value) {
            addCriterion("other_desc like", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescNotLike(String value) {
            addCriterion("other_desc not like", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescIn(List<String> values) {
            addCriterion("other_desc in", values, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescNotIn(List<String> values) {
            addCriterion("other_desc not in", values, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescBetween(String value1, String value2) {
            addCriterion("other_desc between", value1, value2, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescNotBetween(String value1, String value2) {
            addCriterion("other_desc not between", value1, value2, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNull() {
            addCriterion("approval_status is null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNotNull() {
            addCriterion("approval_status is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusEqualTo(String value) {
            addCriterion("approval_status =", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotEqualTo(String value) {
            addCriterion("approval_status <>", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThan(String value) {
            addCriterion("approval_status >", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("approval_status >=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThan(String value) {
            addCriterion("approval_status <", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThanOrEqualTo(String value) {
            addCriterion("approval_status <=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLike(String value) {
            addCriterion("approval_status like", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotLike(String value) {
            addCriterion("approval_status not like", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIn(List<String> values) {
            addCriterion("approval_status in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotIn(List<String> values) {
            addCriterion("approval_status not in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusBetween(String value1, String value2) {
            addCriterion("approval_status between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotBetween(String value1, String value2) {
            addCriterion("approval_status not between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalNameIsNull() {
            addCriterion("approval_name is null");
            return (Criteria) this;
        }

        public Criteria andApprovalNameIsNotNull() {
            addCriterion("approval_name is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalNameEqualTo(String value) {
            addCriterion("approval_name =", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameNotEqualTo(String value) {
            addCriterion("approval_name <>", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameGreaterThan(String value) {
            addCriterion("approval_name >", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameGreaterThanOrEqualTo(String value) {
            addCriterion("approval_name >=", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameLessThan(String value) {
            addCriterion("approval_name <", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameLessThanOrEqualTo(String value) {
            addCriterion("approval_name <=", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameLike(String value) {
            addCriterion("approval_name like", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameNotLike(String value) {
            addCriterion("approval_name not like", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameIn(List<String> values) {
            addCriterion("approval_name in", values, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameNotIn(List<String> values) {
            addCriterion("approval_name not in", values, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameBetween(String value1, String value2) {
            addCriterion("approval_name between", value1, value2, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameNotBetween(String value1, String value2) {
            addCriterion("approval_name not between", value1, value2, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalStatementIsNull() {
            addCriterion("approval_statement is null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatementIsNotNull() {
            addCriterion("approval_statement is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatementEqualTo(String value) {
            addCriterion("approval_statement =", value, "approvalStatement");
            return (Criteria) this;
        }

        public Criteria andApprovalStatementNotEqualTo(String value) {
            addCriterion("approval_statement <>", value, "approvalStatement");
            return (Criteria) this;
        }

        public Criteria andApprovalStatementGreaterThan(String value) {
            addCriterion("approval_statement >", value, "approvalStatement");
            return (Criteria) this;
        }

        public Criteria andApprovalStatementGreaterThanOrEqualTo(String value) {
            addCriterion("approval_statement >=", value, "approvalStatement");
            return (Criteria) this;
        }

        public Criteria andApprovalStatementLessThan(String value) {
            addCriterion("approval_statement <", value, "approvalStatement");
            return (Criteria) this;
        }

        public Criteria andApprovalStatementLessThanOrEqualTo(String value) {
            addCriterion("approval_statement <=", value, "approvalStatement");
            return (Criteria) this;
        }

        public Criteria andApprovalStatementLike(String value) {
            addCriterion("approval_statement like", value, "approvalStatement");
            return (Criteria) this;
        }

        public Criteria andApprovalStatementNotLike(String value) {
            addCriterion("approval_statement not like", value, "approvalStatement");
            return (Criteria) this;
        }

        public Criteria andApprovalStatementIn(List<String> values) {
            addCriterion("approval_statement in", values, "approvalStatement");
            return (Criteria) this;
        }

        public Criteria andApprovalStatementNotIn(List<String> values) {
            addCriterion("approval_statement not in", values, "approvalStatement");
            return (Criteria) this;
        }

        public Criteria andApprovalStatementBetween(String value1, String value2) {
            addCriterion("approval_statement between", value1, value2, "approvalStatement");
            return (Criteria) this;
        }

        public Criteria andApprovalStatementNotBetween(String value1, String value2) {
            addCriterion("approval_statement not between", value1, value2, "approvalStatement");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpidIsNull() {
            addCriterion("update_empid is null");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpidIsNotNull() {
            addCriterion("update_empid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpidEqualTo(Long value) {
            addCriterion("update_empid =", value, "updateEmpid");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpidNotEqualTo(Long value) {
            addCriterion("update_empid <>", value, "updateEmpid");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpidGreaterThan(Long value) {
            addCriterion("update_empid >", value, "updateEmpid");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpidGreaterThanOrEqualTo(Long value) {
            addCriterion("update_empid >=", value, "updateEmpid");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpidLessThan(Long value) {
            addCriterion("update_empid <", value, "updateEmpid");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpidLessThanOrEqualTo(Long value) {
            addCriterion("update_empid <=", value, "updateEmpid");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpidIn(List<Long> values) {
            addCriterion("update_empid in", values, "updateEmpid");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpidNotIn(List<Long> values) {
            addCriterion("update_empid not in", values, "updateEmpid");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpidBetween(Long value1, Long value2) {
            addCriterion("update_empid between", value1, value2, "updateEmpid");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpidNotBetween(Long value1, Long value2) {
            addCriterion("update_empid not between", value1, value2, "updateEmpid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}