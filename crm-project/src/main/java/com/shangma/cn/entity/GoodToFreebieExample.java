package com.shangma.cn.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodToFreebieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodToFreebieExample() {
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

        public Criteria andGoodIdIsNull() {
            addCriterion("good_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("good_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(Long value) {
            addCriterion("good_id =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(Long value) {
            addCriterion("good_id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(Long value) {
            addCriterion("good_id >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(Long value) {
            addCriterion("good_id >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(Long value) {
            addCriterion("good_id <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(Long value) {
            addCriterion("good_id <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<Long> values) {
            addCriterion("good_id in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<Long> values) {
            addCriterion("good_id not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(Long value1, Long value2) {
            addCriterion("good_id between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(Long value1, Long value2) {
            addCriterion("good_id not between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNull() {
            addCriterion("good_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("good_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("good_name =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("good_name <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("good_name >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_name >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("good_name <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("good_name <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("good_name like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("good_name not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("good_name in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("good_name not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("good_name between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("good_name not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdIsNull() {
            addCriterion("good_category_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdIsNotNull() {
            addCriterion("good_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdEqualTo(Long value) {
            addCriterion("good_category_id =", value, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdNotEqualTo(Long value) {
            addCriterion("good_category_id <>", value, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdGreaterThan(Long value) {
            addCriterion("good_category_id >", value, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("good_category_id >=", value, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdLessThan(Long value) {
            addCriterion("good_category_id <", value, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("good_category_id <=", value, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdIn(List<Long> values) {
            addCriterion("good_category_id in", values, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdNotIn(List<Long> values) {
            addCriterion("good_category_id not in", values, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdBetween(Long value1, Long value2) {
            addCriterion("good_category_id between", value1, value2, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("good_category_id not between", value1, value2, "goodCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIdIsNull() {
            addCriterion("good_brand_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIdIsNotNull() {
            addCriterion("good_brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIdEqualTo(Long value) {
            addCriterion("good_brand_id =", value, "goodBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIdNotEqualTo(Long value) {
            addCriterion("good_brand_id <>", value, "goodBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIdGreaterThan(Long value) {
            addCriterion("good_brand_id >", value, "goodBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("good_brand_id >=", value, "goodBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIdLessThan(Long value) {
            addCriterion("good_brand_id <", value, "goodBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("good_brand_id <=", value, "goodBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIdIn(List<Long> values) {
            addCriterion("good_brand_id in", values, "goodBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIdNotIn(List<Long> values) {
            addCriterion("good_brand_id not in", values, "goodBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIdBetween(Long value1, Long value2) {
            addCriterion("good_brand_id between", value1, value2, "goodBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("good_brand_id not between", value1, value2, "goodBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodModelNumIsNull() {
            addCriterion("good_model_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodModelNumIsNotNull() {
            addCriterion("good_model_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodModelNumEqualTo(String value) {
            addCriterion("good_model_num =", value, "goodModelNum");
            return (Criteria) this;
        }

        public Criteria andGoodModelNumNotEqualTo(String value) {
            addCriterion("good_model_num <>", value, "goodModelNum");
            return (Criteria) this;
        }

        public Criteria andGoodModelNumGreaterThan(String value) {
            addCriterion("good_model_num >", value, "goodModelNum");
            return (Criteria) this;
        }

        public Criteria andGoodModelNumGreaterThanOrEqualTo(String value) {
            addCriterion("good_model_num >=", value, "goodModelNum");
            return (Criteria) this;
        }

        public Criteria andGoodModelNumLessThan(String value) {
            addCriterion("good_model_num <", value, "goodModelNum");
            return (Criteria) this;
        }

        public Criteria andGoodModelNumLessThanOrEqualTo(String value) {
            addCriterion("good_model_num <=", value, "goodModelNum");
            return (Criteria) this;
        }

        public Criteria andGoodModelNumLike(String value) {
            addCriterion("good_model_num like", value, "goodModelNum");
            return (Criteria) this;
        }

        public Criteria andGoodModelNumNotLike(String value) {
            addCriterion("good_model_num not like", value, "goodModelNum");
            return (Criteria) this;
        }

        public Criteria andGoodModelNumIn(List<String> values) {
            addCriterion("good_model_num in", values, "goodModelNum");
            return (Criteria) this;
        }

        public Criteria andGoodModelNumNotIn(List<String> values) {
            addCriterion("good_model_num not in", values, "goodModelNum");
            return (Criteria) this;
        }

        public Criteria andGoodModelNumBetween(String value1, String value2) {
            addCriterion("good_model_num between", value1, value2, "goodModelNum");
            return (Criteria) this;
        }

        public Criteria andGoodModelNumNotBetween(String value1, String value2) {
            addCriterion("good_model_num not between", value1, value2, "goodModelNum");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierIdIsNull() {
            addCriterion("good_supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierIdIsNotNull() {
            addCriterion("good_supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierIdEqualTo(Long value) {
            addCriterion("good_supplier_id =", value, "goodSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierIdNotEqualTo(Long value) {
            addCriterion("good_supplier_id <>", value, "goodSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierIdGreaterThan(Long value) {
            addCriterion("good_supplier_id >", value, "goodSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("good_supplier_id >=", value, "goodSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierIdLessThan(Long value) {
            addCriterion("good_supplier_id <", value, "goodSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("good_supplier_id <=", value, "goodSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierIdIn(List<Long> values) {
            addCriterion("good_supplier_id in", values, "goodSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierIdNotIn(List<Long> values) {
            addCriterion("good_supplier_id not in", values, "goodSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierIdBetween(Long value1, Long value2) {
            addCriterion("good_supplier_id between", value1, value2, "goodSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("good_supplier_id not between", value1, value2, "goodSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodDescIsNull() {
            addCriterion("good_desc is null");
            return (Criteria) this;
        }

        public Criteria andGoodDescIsNotNull() {
            addCriterion("good_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGoodDescEqualTo(String value) {
            addCriterion("good_desc =", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescNotEqualTo(String value) {
            addCriterion("good_desc <>", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescGreaterThan(String value) {
            addCriterion("good_desc >", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescGreaterThanOrEqualTo(String value) {
            addCriterion("good_desc >=", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescLessThan(String value) {
            addCriterion("good_desc <", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescLessThanOrEqualTo(String value) {
            addCriterion("good_desc <=", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescLike(String value) {
            addCriterion("good_desc like", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescNotLike(String value) {
            addCriterion("good_desc not like", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescIn(List<String> values) {
            addCriterion("good_desc in", values, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescNotIn(List<String> values) {
            addCriterion("good_desc not in", values, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescBetween(String value1, String value2) {
            addCriterion("good_desc between", value1, value2, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescNotBetween(String value1, String value2) {
            addCriterion("good_desc not between", value1, value2, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodColorIsNull() {
            addCriterion("good_color is null");
            return (Criteria) this;
        }

        public Criteria andGoodColorIsNotNull() {
            addCriterion("good_color is not null");
            return (Criteria) this;
        }

        public Criteria andGoodColorEqualTo(String value) {
            addCriterion("good_color =", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorNotEqualTo(String value) {
            addCriterion("good_color <>", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorGreaterThan(String value) {
            addCriterion("good_color >", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorGreaterThanOrEqualTo(String value) {
            addCriterion("good_color >=", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorLessThan(String value) {
            addCriterion("good_color <", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorLessThanOrEqualTo(String value) {
            addCriterion("good_color <=", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorLike(String value) {
            addCriterion("good_color like", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorNotLike(String value) {
            addCriterion("good_color not like", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorIn(List<String> values) {
            addCriterion("good_color in", values, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorNotIn(List<String> values) {
            addCriterion("good_color not in", values, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorBetween(String value1, String value2) {
            addCriterion("good_color between", value1, value2, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorNotBetween(String value1, String value2) {
            addCriterion("good_color not between", value1, value2, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNull() {
            addCriterion("good_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNotNull() {
            addCriterion("good_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceEqualTo(Double value) {
            addCriterion("good_price =", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotEqualTo(Double value) {
            addCriterion("good_price <>", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThan(Double value) {
            addCriterion("good_price >", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("good_price >=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThan(Double value) {
            addCriterion("good_price <", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThanOrEqualTo(Double value) {
            addCriterion("good_price <=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIn(List<Double> values) {
            addCriterion("good_price in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotIn(List<Double> values) {
            addCriterion("good_price not in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceBetween(Double value1, Double value2) {
            addCriterion("good_price between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotBetween(Double value1, Double value2) {
            addCriterion("good_price not between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodNumIsNull() {
            addCriterion("good_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodNumIsNotNull() {
            addCriterion("good_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNumEqualTo(Integer value) {
            addCriterion("good_num =", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumNotEqualTo(Integer value) {
            addCriterion("good_num <>", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumGreaterThan(Integer value) {
            addCriterion("good_num >", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_num >=", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumLessThan(Integer value) {
            addCriterion("good_num <", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumLessThanOrEqualTo(Integer value) {
            addCriterion("good_num <=", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumIn(List<Integer> values) {
            addCriterion("good_num in", values, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumNotIn(List<Integer> values) {
            addCriterion("good_num not in", values, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumBetween(Integer value1, Integer value2) {
            addCriterion("good_num between", value1, value2, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumNotBetween(Integer value1, Integer value2) {
            addCriterion("good_num not between", value1, value2, "goodNum");
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