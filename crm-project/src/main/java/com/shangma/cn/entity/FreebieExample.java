package com.shangma.cn.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FreebieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FreebieExample() {
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

        public Criteria andFreebieNameIsNull() {
            addCriterion("freebie_name is null");
            return (Criteria) this;
        }

        public Criteria andFreebieNameIsNotNull() {
            addCriterion("freebie_name is not null");
            return (Criteria) this;
        }

        public Criteria andFreebieNameEqualTo(String value) {
            addCriterion("freebie_name =", value, "freebieName");
            return (Criteria) this;
        }

        public Criteria andFreebieNameNotEqualTo(String value) {
            addCriterion("freebie_name <>", value, "freebieName");
            return (Criteria) this;
        }

        public Criteria andFreebieNameGreaterThan(String value) {
            addCriterion("freebie_name >", value, "freebieName");
            return (Criteria) this;
        }

        public Criteria andFreebieNameGreaterThanOrEqualTo(String value) {
            addCriterion("freebie_name >=", value, "freebieName");
            return (Criteria) this;
        }

        public Criteria andFreebieNameLessThan(String value) {
            addCriterion("freebie_name <", value, "freebieName");
            return (Criteria) this;
        }

        public Criteria andFreebieNameLessThanOrEqualTo(String value) {
            addCriterion("freebie_name <=", value, "freebieName");
            return (Criteria) this;
        }

        public Criteria andFreebieNameLike(String value) {
            addCriterion("freebie_name like", value, "freebieName");
            return (Criteria) this;
        }

        public Criteria andFreebieNameNotLike(String value) {
            addCriterion("freebie_name not like", value, "freebieName");
            return (Criteria) this;
        }

        public Criteria andFreebieNameIn(List<String> values) {
            addCriterion("freebie_name in", values, "freebieName");
            return (Criteria) this;
        }

        public Criteria andFreebieNameNotIn(List<String> values) {
            addCriterion("freebie_name not in", values, "freebieName");
            return (Criteria) this;
        }

        public Criteria andFreebieNameBetween(String value1, String value2) {
            addCriterion("freebie_name between", value1, value2, "freebieName");
            return (Criteria) this;
        }

        public Criteria andFreebieNameNotBetween(String value1, String value2) {
            addCriterion("freebie_name not between", value1, value2, "freebieName");
            return (Criteria) this;
        }

        public Criteria andFreebieCategoryIdIsNull() {
            addCriterion("freebie_category_id is null");
            return (Criteria) this;
        }

        public Criteria andFreebieCategoryIdIsNotNull() {
            addCriterion("freebie_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreebieCategoryIdEqualTo(Long value) {
            addCriterion("freebie_category_id =", value, "freebieCategoryId");
            return (Criteria) this;
        }

        public Criteria andFreebieCategoryIdNotEqualTo(Long value) {
            addCriterion("freebie_category_id <>", value, "freebieCategoryId");
            return (Criteria) this;
        }

        public Criteria andFreebieCategoryIdGreaterThan(Long value) {
            addCriterion("freebie_category_id >", value, "freebieCategoryId");
            return (Criteria) this;
        }

        public Criteria andFreebieCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("freebie_category_id >=", value, "freebieCategoryId");
            return (Criteria) this;
        }

        public Criteria andFreebieCategoryIdLessThan(Long value) {
            addCriterion("freebie_category_id <", value, "freebieCategoryId");
            return (Criteria) this;
        }

        public Criteria andFreebieCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("freebie_category_id <=", value, "freebieCategoryId");
            return (Criteria) this;
        }

        public Criteria andFreebieCategoryIdIn(List<Long> values) {
            addCriterion("freebie_category_id in", values, "freebieCategoryId");
            return (Criteria) this;
        }

        public Criteria andFreebieCategoryIdNotIn(List<Long> values) {
            addCriterion("freebie_category_id not in", values, "freebieCategoryId");
            return (Criteria) this;
        }

        public Criteria andFreebieCategoryIdBetween(Long value1, Long value2) {
            addCriterion("freebie_category_id between", value1, value2, "freebieCategoryId");
            return (Criteria) this;
        }

        public Criteria andFreebieCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("freebie_category_id not between", value1, value2, "freebieCategoryId");
            return (Criteria) this;
        }

        public Criteria andFreebieBrandIdIsNull() {
            addCriterion("freebie_brand_id is null");
            return (Criteria) this;
        }

        public Criteria andFreebieBrandIdIsNotNull() {
            addCriterion("freebie_brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreebieBrandIdEqualTo(Long value) {
            addCriterion("freebie_brand_id =", value, "freebieBrandId");
            return (Criteria) this;
        }

        public Criteria andFreebieBrandIdNotEqualTo(Long value) {
            addCriterion("freebie_brand_id <>", value, "freebieBrandId");
            return (Criteria) this;
        }

        public Criteria andFreebieBrandIdGreaterThan(Long value) {
            addCriterion("freebie_brand_id >", value, "freebieBrandId");
            return (Criteria) this;
        }

        public Criteria andFreebieBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("freebie_brand_id >=", value, "freebieBrandId");
            return (Criteria) this;
        }

        public Criteria andFreebieBrandIdLessThan(Long value) {
            addCriterion("freebie_brand_id <", value, "freebieBrandId");
            return (Criteria) this;
        }

        public Criteria andFreebieBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("freebie_brand_id <=", value, "freebieBrandId");
            return (Criteria) this;
        }

        public Criteria andFreebieBrandIdIn(List<Long> values) {
            addCriterion("freebie_brand_id in", values, "freebieBrandId");
            return (Criteria) this;
        }

        public Criteria andFreebieBrandIdNotIn(List<Long> values) {
            addCriterion("freebie_brand_id not in", values, "freebieBrandId");
            return (Criteria) this;
        }

        public Criteria andFreebieBrandIdBetween(Long value1, Long value2) {
            addCriterion("freebie_brand_id between", value1, value2, "freebieBrandId");
            return (Criteria) this;
        }

        public Criteria andFreebieBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("freebie_brand_id not between", value1, value2, "freebieBrandId");
            return (Criteria) this;
        }

        public Criteria andFreebieModelNumIsNull() {
            addCriterion("freebie_model_num is null");
            return (Criteria) this;
        }

        public Criteria andFreebieModelNumIsNotNull() {
            addCriterion("freebie_model_num is not null");
            return (Criteria) this;
        }

        public Criteria andFreebieModelNumEqualTo(String value) {
            addCriterion("freebie_model_num =", value, "freebieModelNum");
            return (Criteria) this;
        }

        public Criteria andFreebieModelNumNotEqualTo(String value) {
            addCriterion("freebie_model_num <>", value, "freebieModelNum");
            return (Criteria) this;
        }

        public Criteria andFreebieModelNumGreaterThan(String value) {
            addCriterion("freebie_model_num >", value, "freebieModelNum");
            return (Criteria) this;
        }

        public Criteria andFreebieModelNumGreaterThanOrEqualTo(String value) {
            addCriterion("freebie_model_num >=", value, "freebieModelNum");
            return (Criteria) this;
        }

        public Criteria andFreebieModelNumLessThan(String value) {
            addCriterion("freebie_model_num <", value, "freebieModelNum");
            return (Criteria) this;
        }

        public Criteria andFreebieModelNumLessThanOrEqualTo(String value) {
            addCriterion("freebie_model_num <=", value, "freebieModelNum");
            return (Criteria) this;
        }

        public Criteria andFreebieModelNumLike(String value) {
            addCriterion("freebie_model_num like", value, "freebieModelNum");
            return (Criteria) this;
        }

        public Criteria andFreebieModelNumNotLike(String value) {
            addCriterion("freebie_model_num not like", value, "freebieModelNum");
            return (Criteria) this;
        }

        public Criteria andFreebieModelNumIn(List<String> values) {
            addCriterion("freebie_model_num in", values, "freebieModelNum");
            return (Criteria) this;
        }

        public Criteria andFreebieModelNumNotIn(List<String> values) {
            addCriterion("freebie_model_num not in", values, "freebieModelNum");
            return (Criteria) this;
        }

        public Criteria andFreebieModelNumBetween(String value1, String value2) {
            addCriterion("freebie_model_num between", value1, value2, "freebieModelNum");
            return (Criteria) this;
        }

        public Criteria andFreebieModelNumNotBetween(String value1, String value2) {
            addCriterion("freebie_model_num not between", value1, value2, "freebieModelNum");
            return (Criteria) this;
        }

        public Criteria andFreebieSupplierIdIsNull() {
            addCriterion("freebie_supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andFreebieSupplierIdIsNotNull() {
            addCriterion("freebie_supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreebieSupplierIdEqualTo(Long value) {
            addCriterion("freebie_supplier_id =", value, "freebieSupplierId");
            return (Criteria) this;
        }

        public Criteria andFreebieSupplierIdNotEqualTo(Long value) {
            addCriterion("freebie_supplier_id <>", value, "freebieSupplierId");
            return (Criteria) this;
        }

        public Criteria andFreebieSupplierIdGreaterThan(Long value) {
            addCriterion("freebie_supplier_id >", value, "freebieSupplierId");
            return (Criteria) this;
        }

        public Criteria andFreebieSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("freebie_supplier_id >=", value, "freebieSupplierId");
            return (Criteria) this;
        }

        public Criteria andFreebieSupplierIdLessThan(Long value) {
            addCriterion("freebie_supplier_id <", value, "freebieSupplierId");
            return (Criteria) this;
        }

        public Criteria andFreebieSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("freebie_supplier_id <=", value, "freebieSupplierId");
            return (Criteria) this;
        }

        public Criteria andFreebieSupplierIdIn(List<Long> values) {
            addCriterion("freebie_supplier_id in", values, "freebieSupplierId");
            return (Criteria) this;
        }

        public Criteria andFreebieSupplierIdNotIn(List<Long> values) {
            addCriterion("freebie_supplier_id not in", values, "freebieSupplierId");
            return (Criteria) this;
        }

        public Criteria andFreebieSupplierIdBetween(Long value1, Long value2) {
            addCriterion("freebie_supplier_id between", value1, value2, "freebieSupplierId");
            return (Criteria) this;
        }

        public Criteria andFreebieSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("freebie_supplier_id not between", value1, value2, "freebieSupplierId");
            return (Criteria) this;
        }

        public Criteria andFreebieDescIsNull() {
            addCriterion("freebie_desc is null");
            return (Criteria) this;
        }

        public Criteria andFreebieDescIsNotNull() {
            addCriterion("freebie_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFreebieDescEqualTo(String value) {
            addCriterion("freebie_desc =", value, "freebieDesc");
            return (Criteria) this;
        }

        public Criteria andFreebieDescNotEqualTo(String value) {
            addCriterion("freebie_desc <>", value, "freebieDesc");
            return (Criteria) this;
        }

        public Criteria andFreebieDescGreaterThan(String value) {
            addCriterion("freebie_desc >", value, "freebieDesc");
            return (Criteria) this;
        }

        public Criteria andFreebieDescGreaterThanOrEqualTo(String value) {
            addCriterion("freebie_desc >=", value, "freebieDesc");
            return (Criteria) this;
        }

        public Criteria andFreebieDescLessThan(String value) {
            addCriterion("freebie_desc <", value, "freebieDesc");
            return (Criteria) this;
        }

        public Criteria andFreebieDescLessThanOrEqualTo(String value) {
            addCriterion("freebie_desc <=", value, "freebieDesc");
            return (Criteria) this;
        }

        public Criteria andFreebieDescLike(String value) {
            addCriterion("freebie_desc like", value, "freebieDesc");
            return (Criteria) this;
        }

        public Criteria andFreebieDescNotLike(String value) {
            addCriterion("freebie_desc not like", value, "freebieDesc");
            return (Criteria) this;
        }

        public Criteria andFreebieDescIn(List<String> values) {
            addCriterion("freebie_desc in", values, "freebieDesc");
            return (Criteria) this;
        }

        public Criteria andFreebieDescNotIn(List<String> values) {
            addCriterion("freebie_desc not in", values, "freebieDesc");
            return (Criteria) this;
        }

        public Criteria andFreebieDescBetween(String value1, String value2) {
            addCriterion("freebie_desc between", value1, value2, "freebieDesc");
            return (Criteria) this;
        }

        public Criteria andFreebieDescNotBetween(String value1, String value2) {
            addCriterion("freebie_desc not between", value1, value2, "freebieDesc");
            return (Criteria) this;
        }

        public Criteria andFreebieColorIsNull() {
            addCriterion("freebie_color is null");
            return (Criteria) this;
        }

        public Criteria andFreebieColorIsNotNull() {
            addCriterion("freebie_color is not null");
            return (Criteria) this;
        }

        public Criteria andFreebieColorEqualTo(String value) {
            addCriterion("freebie_color =", value, "freebieColor");
            return (Criteria) this;
        }

        public Criteria andFreebieColorNotEqualTo(String value) {
            addCriterion("freebie_color <>", value, "freebieColor");
            return (Criteria) this;
        }

        public Criteria andFreebieColorGreaterThan(String value) {
            addCriterion("freebie_color >", value, "freebieColor");
            return (Criteria) this;
        }

        public Criteria andFreebieColorGreaterThanOrEqualTo(String value) {
            addCriterion("freebie_color >=", value, "freebieColor");
            return (Criteria) this;
        }

        public Criteria andFreebieColorLessThan(String value) {
            addCriterion("freebie_color <", value, "freebieColor");
            return (Criteria) this;
        }

        public Criteria andFreebieColorLessThanOrEqualTo(String value) {
            addCriterion("freebie_color <=", value, "freebieColor");
            return (Criteria) this;
        }

        public Criteria andFreebieColorLike(String value) {
            addCriterion("freebie_color like", value, "freebieColor");
            return (Criteria) this;
        }

        public Criteria andFreebieColorNotLike(String value) {
            addCriterion("freebie_color not like", value, "freebieColor");
            return (Criteria) this;
        }

        public Criteria andFreebieColorIn(List<String> values) {
            addCriterion("freebie_color in", values, "freebieColor");
            return (Criteria) this;
        }

        public Criteria andFreebieColorNotIn(List<String> values) {
            addCriterion("freebie_color not in", values, "freebieColor");
            return (Criteria) this;
        }

        public Criteria andFreebieColorBetween(String value1, String value2) {
            addCriterion("freebie_color between", value1, value2, "freebieColor");
            return (Criteria) this;
        }

        public Criteria andFreebieColorNotBetween(String value1, String value2) {
            addCriterion("freebie_color not between", value1, value2, "freebieColor");
            return (Criteria) this;
        }

        public Criteria andFreebiePriceIsNull() {
            addCriterion("freebie_price is null");
            return (Criteria) this;
        }

        public Criteria andFreebiePriceIsNotNull() {
            addCriterion("freebie_price is not null");
            return (Criteria) this;
        }

        public Criteria andFreebiePriceEqualTo(Double value) {
            addCriterion("freebie_price =", value, "freebiePrice");
            return (Criteria) this;
        }

        public Criteria andFreebiePriceNotEqualTo(Double value) {
            addCriterion("freebie_price <>", value, "freebiePrice");
            return (Criteria) this;
        }

        public Criteria andFreebiePriceGreaterThan(Double value) {
            addCriterion("freebie_price >", value, "freebiePrice");
            return (Criteria) this;
        }

        public Criteria andFreebiePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("freebie_price >=", value, "freebiePrice");
            return (Criteria) this;
        }

        public Criteria andFreebiePriceLessThan(Double value) {
            addCriterion("freebie_price <", value, "freebiePrice");
            return (Criteria) this;
        }

        public Criteria andFreebiePriceLessThanOrEqualTo(Double value) {
            addCriterion("freebie_price <=", value, "freebiePrice");
            return (Criteria) this;
        }

        public Criteria andFreebiePriceIn(List<Double> values) {
            addCriterion("freebie_price in", values, "freebiePrice");
            return (Criteria) this;
        }

        public Criteria andFreebiePriceNotIn(List<Double> values) {
            addCriterion("freebie_price not in", values, "freebiePrice");
            return (Criteria) this;
        }

        public Criteria andFreebiePriceBetween(Double value1, Double value2) {
            addCriterion("freebie_price between", value1, value2, "freebiePrice");
            return (Criteria) this;
        }

        public Criteria andFreebiePriceNotBetween(Double value1, Double value2) {
            addCriterion("freebie_price not between", value1, value2, "freebiePrice");
            return (Criteria) this;
        }

        public Criteria andFreebieNumIsNull() {
            addCriterion("freebie_num is null");
            return (Criteria) this;
        }

        public Criteria andFreebieNumIsNotNull() {
            addCriterion("freebie_num is not null");
            return (Criteria) this;
        }

        public Criteria andFreebieNumEqualTo(Integer value) {
            addCriterion("freebie_num =", value, "freebieNum");
            return (Criteria) this;
        }

        public Criteria andFreebieNumNotEqualTo(Integer value) {
            addCriterion("freebie_num <>", value, "freebieNum");
            return (Criteria) this;
        }

        public Criteria andFreebieNumGreaterThan(Integer value) {
            addCriterion("freebie_num >", value, "freebieNum");
            return (Criteria) this;
        }

        public Criteria andFreebieNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("freebie_num >=", value, "freebieNum");
            return (Criteria) this;
        }

        public Criteria andFreebieNumLessThan(Integer value) {
            addCriterion("freebie_num <", value, "freebieNum");
            return (Criteria) this;
        }

        public Criteria andFreebieNumLessThanOrEqualTo(Integer value) {
            addCriterion("freebie_num <=", value, "freebieNum");
            return (Criteria) this;
        }

        public Criteria andFreebieNumIn(List<Integer> values) {
            addCriterion("freebie_num in", values, "freebieNum");
            return (Criteria) this;
        }

        public Criteria andFreebieNumNotIn(List<Integer> values) {
            addCriterion("freebie_num not in", values, "freebieNum");
            return (Criteria) this;
        }

        public Criteria andFreebieNumBetween(Integer value1, Integer value2) {
            addCriterion("freebie_num between", value1, value2, "freebieNum");
            return (Criteria) this;
        }

        public Criteria andFreebieNumNotBetween(Integer value1, Integer value2) {
            addCriterion("freebie_num not between", value1, value2, "freebieNum");
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