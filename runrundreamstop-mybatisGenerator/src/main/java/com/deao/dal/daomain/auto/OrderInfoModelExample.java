package com.deao.dal.daomain.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoModelExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderCardNoIsNull() {
            addCriterion("order_card_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderCardNoIsNotNull() {
            addCriterion("order_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCardNoEqualTo(String value) {
            addCriterion("order_card_no =", value, "orderCardNo");
            return (Criteria) this;
        }

        public Criteria andOrderCardNoNotEqualTo(String value) {
            addCriterion("order_card_no <>", value, "orderCardNo");
            return (Criteria) this;
        }

        public Criteria andOrderCardNoGreaterThan(String value) {
            addCriterion("order_card_no >", value, "orderCardNo");
            return (Criteria) this;
        }

        public Criteria andOrderCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_card_no >=", value, "orderCardNo");
            return (Criteria) this;
        }

        public Criteria andOrderCardNoLessThan(String value) {
            addCriterion("order_card_no <", value, "orderCardNo");
            return (Criteria) this;
        }

        public Criteria andOrderCardNoLessThanOrEqualTo(String value) {
            addCriterion("order_card_no <=", value, "orderCardNo");
            return (Criteria) this;
        }

        public Criteria andOrderCardNoLike(String value) {
            addCriterion("order_card_no like", value, "orderCardNo");
            return (Criteria) this;
        }

        public Criteria andOrderCardNoNotLike(String value) {
            addCriterion("order_card_no not like", value, "orderCardNo");
            return (Criteria) this;
        }

        public Criteria andOrderCardNoIn(List<String> values) {
            addCriterion("order_card_no in", values, "orderCardNo");
            return (Criteria) this;
        }

        public Criteria andOrderCardNoNotIn(List<String> values) {
            addCriterion("order_card_no not in", values, "orderCardNo");
            return (Criteria) this;
        }

        public Criteria andOrderCardNoBetween(String value1, String value2) {
            addCriterion("order_card_no between", value1, value2, "orderCardNo");
            return (Criteria) this;
        }

        public Criteria andOrderCardNoNotBetween(String value1, String value2) {
            addCriterion("order_card_no not between", value1, value2, "orderCardNo");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNull() {
            addCriterion("order_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNotNull() {
            addCriterion("order_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNameEqualTo(String value) {
            addCriterion("order_name =", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotEqualTo(String value) {
            addCriterion("order_name <>", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThan(String value) {
            addCriterion("order_name >", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_name >=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThan(String value) {
            addCriterion("order_name <", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThanOrEqualTo(String value) {
            addCriterion("order_name <=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLike(String value) {
            addCriterion("order_name like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotLike(String value) {
            addCriterion("order_name not like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameIn(List<String> values) {
            addCriterion("order_name in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotIn(List<String> values) {
            addCriterion("order_name not in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameBetween(String value1, String value2) {
            addCriterion("order_name between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotBetween(String value1, String value2) {
            addCriterion("order_name not between", value1, value2, "orderName");
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

        public Criteria andOrderStatusValuesIsNull() {
            addCriterion("order_status_values is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusValuesIsNotNull() {
            addCriterion("order_status_values is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusValuesEqualTo(String value) {
            addCriterion("order_status_values =", value, "orderStatusValues");
            return (Criteria) this;
        }

        public Criteria andOrderStatusValuesNotEqualTo(String value) {
            addCriterion("order_status_values <>", value, "orderStatusValues");
            return (Criteria) this;
        }

        public Criteria andOrderStatusValuesGreaterThan(String value) {
            addCriterion("order_status_values >", value, "orderStatusValues");
            return (Criteria) this;
        }

        public Criteria andOrderStatusValuesGreaterThanOrEqualTo(String value) {
            addCriterion("order_status_values >=", value, "orderStatusValues");
            return (Criteria) this;
        }

        public Criteria andOrderStatusValuesLessThan(String value) {
            addCriterion("order_status_values <", value, "orderStatusValues");
            return (Criteria) this;
        }

        public Criteria andOrderStatusValuesLessThanOrEqualTo(String value) {
            addCriterion("order_status_values <=", value, "orderStatusValues");
            return (Criteria) this;
        }

        public Criteria andOrderStatusValuesLike(String value) {
            addCriterion("order_status_values like", value, "orderStatusValues");
            return (Criteria) this;
        }

        public Criteria andOrderStatusValuesNotLike(String value) {
            addCriterion("order_status_values not like", value, "orderStatusValues");
            return (Criteria) this;
        }

        public Criteria andOrderStatusValuesIn(List<String> values) {
            addCriterion("order_status_values in", values, "orderStatusValues");
            return (Criteria) this;
        }

        public Criteria andOrderStatusValuesNotIn(List<String> values) {
            addCriterion("order_status_values not in", values, "orderStatusValues");
            return (Criteria) this;
        }

        public Criteria andOrderStatusValuesBetween(String value1, String value2) {
            addCriterion("order_status_values between", value1, value2, "orderStatusValues");
            return (Criteria) this;
        }

        public Criteria andOrderStatusValuesNotBetween(String value1, String value2) {
            addCriterion("order_status_values not between", value1, value2, "orderStatusValues");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(BigDecimal value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(BigDecimal value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(BigDecimal value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<BigDecimal> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationNumberIsNull() {
            addCriterion("integration_number is null");
            return (Criteria) this;
        }

        public Criteria andIntegrationNumberIsNotNull() {
            addCriterion("integration_number is not null");
            return (Criteria) this;
        }

        public Criteria andIntegrationNumberEqualTo(Integer value) {
            addCriterion("integration_number =", value, "integrationNumber");
            return (Criteria) this;
        }

        public Criteria andIntegrationNumberNotEqualTo(Integer value) {
            addCriterion("integration_number <>", value, "integrationNumber");
            return (Criteria) this;
        }

        public Criteria andIntegrationNumberGreaterThan(Integer value) {
            addCriterion("integration_number >", value, "integrationNumber");
            return (Criteria) this;
        }

        public Criteria andIntegrationNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("integration_number >=", value, "integrationNumber");
            return (Criteria) this;
        }

        public Criteria andIntegrationNumberLessThan(Integer value) {
            addCriterion("integration_number <", value, "integrationNumber");
            return (Criteria) this;
        }

        public Criteria andIntegrationNumberLessThanOrEqualTo(Integer value) {
            addCriterion("integration_number <=", value, "integrationNumber");
            return (Criteria) this;
        }

        public Criteria andIntegrationNumberIn(List<Integer> values) {
            addCriterion("integration_number in", values, "integrationNumber");
            return (Criteria) this;
        }

        public Criteria andIntegrationNumberNotIn(List<Integer> values) {
            addCriterion("integration_number not in", values, "integrationNumber");
            return (Criteria) this;
        }

        public Criteria andIntegrationNumberBetween(Integer value1, Integer value2) {
            addCriterion("integration_number between", value1, value2, "integrationNumber");
            return (Criteria) this;
        }

        public Criteria andIntegrationNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("integration_number not between", value1, value2, "integrationNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andEduTypeIsNull() {
            addCriterion("edu_type is null");
            return (Criteria) this;
        }

        public Criteria andEduTypeIsNotNull() {
            addCriterion("edu_type is not null");
            return (Criteria) this;
        }

        public Criteria andEduTypeEqualTo(String value) {
            addCriterion("edu_type =", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeNotEqualTo(String value) {
            addCriterion("edu_type <>", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeGreaterThan(String value) {
            addCriterion("edu_type >", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeGreaterThanOrEqualTo(String value) {
            addCriterion("edu_type >=", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeLessThan(String value) {
            addCriterion("edu_type <", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeLessThanOrEqualTo(String value) {
            addCriterion("edu_type <=", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeLike(String value) {
            addCriterion("edu_type like", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeNotLike(String value) {
            addCriterion("edu_type not like", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeIn(List<String> values) {
            addCriterion("edu_type in", values, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeNotIn(List<String> values) {
            addCriterion("edu_type not in", values, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeBetween(String value1, String value2) {
            addCriterion("edu_type between", value1, value2, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeNotBetween(String value1, String value2) {
            addCriterion("edu_type not between", value1, value2, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeValuesIsNull() {
            addCriterion("edu_type_values is null");
            return (Criteria) this;
        }

        public Criteria andEduTypeValuesIsNotNull() {
            addCriterion("edu_type_values is not null");
            return (Criteria) this;
        }

        public Criteria andEduTypeValuesEqualTo(String value) {
            addCriterion("edu_type_values =", value, "eduTypeValues");
            return (Criteria) this;
        }

        public Criteria andEduTypeValuesNotEqualTo(String value) {
            addCriterion("edu_type_values <>", value, "eduTypeValues");
            return (Criteria) this;
        }

        public Criteria andEduTypeValuesGreaterThan(String value) {
            addCriterion("edu_type_values >", value, "eduTypeValues");
            return (Criteria) this;
        }

        public Criteria andEduTypeValuesGreaterThanOrEqualTo(String value) {
            addCriterion("edu_type_values >=", value, "eduTypeValues");
            return (Criteria) this;
        }

        public Criteria andEduTypeValuesLessThan(String value) {
            addCriterion("edu_type_values <", value, "eduTypeValues");
            return (Criteria) this;
        }

        public Criteria andEduTypeValuesLessThanOrEqualTo(String value) {
            addCriterion("edu_type_values <=", value, "eduTypeValues");
            return (Criteria) this;
        }

        public Criteria andEduTypeValuesLike(String value) {
            addCriterion("edu_type_values like", value, "eduTypeValues");
            return (Criteria) this;
        }

        public Criteria andEduTypeValuesNotLike(String value) {
            addCriterion("edu_type_values not like", value, "eduTypeValues");
            return (Criteria) this;
        }

        public Criteria andEduTypeValuesIn(List<String> values) {
            addCriterion("edu_type_values in", values, "eduTypeValues");
            return (Criteria) this;
        }

        public Criteria andEduTypeValuesNotIn(List<String> values) {
            addCriterion("edu_type_values not in", values, "eduTypeValues");
            return (Criteria) this;
        }

        public Criteria andEduTypeValuesBetween(String value1, String value2) {
            addCriterion("edu_type_values between", value1, value2, "eduTypeValues");
            return (Criteria) this;
        }

        public Criteria andEduTypeValuesNotBetween(String value1, String value2) {
            addCriterion("edu_type_values not between", value1, value2, "eduTypeValues");
            return (Criteria) this;
        }

        public Criteria andOneLevelIsNull() {
            addCriterion("one_level is null");
            return (Criteria) this;
        }

        public Criteria andOneLevelIsNotNull() {
            addCriterion("one_level is not null");
            return (Criteria) this;
        }

        public Criteria andOneLevelEqualTo(Integer value) {
            addCriterion("one_level =", value, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelNotEqualTo(Integer value) {
            addCriterion("one_level <>", value, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelGreaterThan(Integer value) {
            addCriterion("one_level >", value, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("one_level >=", value, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelLessThan(Integer value) {
            addCriterion("one_level <", value, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelLessThanOrEqualTo(Integer value) {
            addCriterion("one_level <=", value, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelIn(List<Integer> values) {
            addCriterion("one_level in", values, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelNotIn(List<Integer> values) {
            addCriterion("one_level not in", values, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelBetween(Integer value1, Integer value2) {
            addCriterion("one_level between", value1, value2, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("one_level not between", value1, value2, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelNameIsNull() {
            addCriterion("one_level_name is null");
            return (Criteria) this;
        }

        public Criteria andOneLevelNameIsNotNull() {
            addCriterion("one_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andOneLevelNameEqualTo(String value) {
            addCriterion("one_level_name =", value, "oneLevelName");
            return (Criteria) this;
        }

        public Criteria andOneLevelNameNotEqualTo(String value) {
            addCriterion("one_level_name <>", value, "oneLevelName");
            return (Criteria) this;
        }

        public Criteria andOneLevelNameGreaterThan(String value) {
            addCriterion("one_level_name >", value, "oneLevelName");
            return (Criteria) this;
        }

        public Criteria andOneLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("one_level_name >=", value, "oneLevelName");
            return (Criteria) this;
        }

        public Criteria andOneLevelNameLessThan(String value) {
            addCriterion("one_level_name <", value, "oneLevelName");
            return (Criteria) this;
        }

        public Criteria andOneLevelNameLessThanOrEqualTo(String value) {
            addCriterion("one_level_name <=", value, "oneLevelName");
            return (Criteria) this;
        }

        public Criteria andOneLevelNameLike(String value) {
            addCriterion("one_level_name like", value, "oneLevelName");
            return (Criteria) this;
        }

        public Criteria andOneLevelNameNotLike(String value) {
            addCriterion("one_level_name not like", value, "oneLevelName");
            return (Criteria) this;
        }

        public Criteria andOneLevelNameIn(List<String> values) {
            addCriterion("one_level_name in", values, "oneLevelName");
            return (Criteria) this;
        }

        public Criteria andOneLevelNameNotIn(List<String> values) {
            addCriterion("one_level_name not in", values, "oneLevelName");
            return (Criteria) this;
        }

        public Criteria andOneLevelNameBetween(String value1, String value2) {
            addCriterion("one_level_name between", value1, value2, "oneLevelName");
            return (Criteria) this;
        }

        public Criteria andOneLevelNameNotBetween(String value1, String value2) {
            addCriterion("one_level_name not between", value1, value2, "oneLevelName");
            return (Criteria) this;
        }

        public Criteria andTwoLevelIsNull() {
            addCriterion("two_level is null");
            return (Criteria) this;
        }

        public Criteria andTwoLevelIsNotNull() {
            addCriterion("two_level is not null");
            return (Criteria) this;
        }

        public Criteria andTwoLevelEqualTo(Integer value) {
            addCriterion("two_level =", value, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNotEqualTo(Integer value) {
            addCriterion("two_level <>", value, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelGreaterThan(Integer value) {
            addCriterion("two_level >", value, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("two_level >=", value, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelLessThan(Integer value) {
            addCriterion("two_level <", value, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelLessThanOrEqualTo(Integer value) {
            addCriterion("two_level <=", value, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelIn(List<Integer> values) {
            addCriterion("two_level in", values, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNotIn(List<Integer> values) {
            addCriterion("two_level not in", values, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelBetween(Integer value1, Integer value2) {
            addCriterion("two_level between", value1, value2, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("two_level not between", value1, value2, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNameIsNull() {
            addCriterion("two_level_name is null");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNameIsNotNull() {
            addCriterion("two_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNameEqualTo(String value) {
            addCriterion("two_level_name =", value, "twoLevelName");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNameNotEqualTo(String value) {
            addCriterion("two_level_name <>", value, "twoLevelName");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNameGreaterThan(String value) {
            addCriterion("two_level_name >", value, "twoLevelName");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("two_level_name >=", value, "twoLevelName");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNameLessThan(String value) {
            addCriterion("two_level_name <", value, "twoLevelName");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNameLessThanOrEqualTo(String value) {
            addCriterion("two_level_name <=", value, "twoLevelName");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNameLike(String value) {
            addCriterion("two_level_name like", value, "twoLevelName");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNameNotLike(String value) {
            addCriterion("two_level_name not like", value, "twoLevelName");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNameIn(List<String> values) {
            addCriterion("two_level_name in", values, "twoLevelName");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNameNotIn(List<String> values) {
            addCriterion("two_level_name not in", values, "twoLevelName");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNameBetween(String value1, String value2) {
            addCriterion("two_level_name between", value1, value2, "twoLevelName");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNameNotBetween(String value1, String value2) {
            addCriterion("two_level_name not between", value1, value2, "twoLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIsNull() {
            addCriterion("three_level is null");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIsNotNull() {
            addCriterion("three_level is not null");
            return (Criteria) this;
        }

        public Criteria andThreeLevelEqualTo(Integer value) {
            addCriterion("three_level =", value, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNotEqualTo(Integer value) {
            addCriterion("three_level <>", value, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelGreaterThan(Integer value) {
            addCriterion("three_level >", value, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("three_level >=", value, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelLessThan(Integer value) {
            addCriterion("three_level <", value, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelLessThanOrEqualTo(Integer value) {
            addCriterion("three_level <=", value, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIn(List<Integer> values) {
            addCriterion("three_level in", values, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNotIn(List<Integer> values) {
            addCriterion("three_level not in", values, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelBetween(Integer value1, Integer value2) {
            addCriterion("three_level between", value1, value2, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("three_level not between", value1, value2, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameIsNull() {
            addCriterion("three_level_name is null");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameIsNotNull() {
            addCriterion("three_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameEqualTo(String value) {
            addCriterion("three_level_name =", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameNotEqualTo(String value) {
            addCriterion("three_level_name <>", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameGreaterThan(String value) {
            addCriterion("three_level_name >", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("three_level_name >=", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameLessThan(String value) {
            addCriterion("three_level_name <", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameLessThanOrEqualTo(String value) {
            addCriterion("three_level_name <=", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameLike(String value) {
            addCriterion("three_level_name like", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameNotLike(String value) {
            addCriterion("three_level_name not like", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameIn(List<String> values) {
            addCriterion("three_level_name in", values, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameNotIn(List<String> values) {
            addCriterion("three_level_name not in", values, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameBetween(String value1, String value2) {
            addCriterion("three_level_name between", value1, value2, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameNotBetween(String value1, String value2) {
            addCriterion("three_level_name not between", value1, value2, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andCultureFractionIsNull() {
            addCriterion("culture_fraction is null");
            return (Criteria) this;
        }

        public Criteria andCultureFractionIsNotNull() {
            addCriterion("culture_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andCultureFractionEqualTo(Integer value) {
            addCriterion("culture_fraction =", value, "cultureFraction");
            return (Criteria) this;
        }

        public Criteria andCultureFractionNotEqualTo(Integer value) {
            addCriterion("culture_fraction <>", value, "cultureFraction");
            return (Criteria) this;
        }

        public Criteria andCultureFractionGreaterThan(Integer value) {
            addCriterion("culture_fraction >", value, "cultureFraction");
            return (Criteria) this;
        }

        public Criteria andCultureFractionGreaterThanOrEqualTo(Integer value) {
            addCriterion("culture_fraction >=", value, "cultureFraction");
            return (Criteria) this;
        }

        public Criteria andCultureFractionLessThan(Integer value) {
            addCriterion("culture_fraction <", value, "cultureFraction");
            return (Criteria) this;
        }

        public Criteria andCultureFractionLessThanOrEqualTo(Integer value) {
            addCriterion("culture_fraction <=", value, "cultureFraction");
            return (Criteria) this;
        }

        public Criteria andCultureFractionIn(List<Integer> values) {
            addCriterion("culture_fraction in", values, "cultureFraction");
            return (Criteria) this;
        }

        public Criteria andCultureFractionNotIn(List<Integer> values) {
            addCriterion("culture_fraction not in", values, "cultureFraction");
            return (Criteria) this;
        }

        public Criteria andCultureFractionBetween(Integer value1, Integer value2) {
            addCriterion("culture_fraction between", value1, value2, "cultureFraction");
            return (Criteria) this;
        }

        public Criteria andCultureFractionNotBetween(Integer value1, Integer value2) {
            addCriterion("culture_fraction not between", value1, value2, "cultureFraction");
            return (Criteria) this;
        }

        public Criteria andMajorFractionIsNull() {
            addCriterion("major_fraction is null");
            return (Criteria) this;
        }

        public Criteria andMajorFractionIsNotNull() {
            addCriterion("major_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andMajorFractionEqualTo(Integer value) {
            addCriterion("major_fraction =", value, "majorFraction");
            return (Criteria) this;
        }

        public Criteria andMajorFractionNotEqualTo(Integer value) {
            addCriterion("major_fraction <>", value, "majorFraction");
            return (Criteria) this;
        }

        public Criteria andMajorFractionGreaterThan(Integer value) {
            addCriterion("major_fraction >", value, "majorFraction");
            return (Criteria) this;
        }

        public Criteria andMajorFractionGreaterThanOrEqualTo(Integer value) {
            addCriterion("major_fraction >=", value, "majorFraction");
            return (Criteria) this;
        }

        public Criteria andMajorFractionLessThan(Integer value) {
            addCriterion("major_fraction <", value, "majorFraction");
            return (Criteria) this;
        }

        public Criteria andMajorFractionLessThanOrEqualTo(Integer value) {
            addCriterion("major_fraction <=", value, "majorFraction");
            return (Criteria) this;
        }

        public Criteria andMajorFractionIn(List<Integer> values) {
            addCriterion("major_fraction in", values, "majorFraction");
            return (Criteria) this;
        }

        public Criteria andMajorFractionNotIn(List<Integer> values) {
            addCriterion("major_fraction not in", values, "majorFraction");
            return (Criteria) this;
        }

        public Criteria andMajorFractionBetween(Integer value1, Integer value2) {
            addCriterion("major_fraction between", value1, value2, "majorFraction");
            return (Criteria) this;
        }

        public Criteria andMajorFractionNotBetween(Integer value1, Integer value2) {
            addCriterion("major_fraction not between", value1, value2, "majorFraction");
            return (Criteria) this;
        }

        public Criteria andInviteNumberIsNull() {
            addCriterion("invite_number is null");
            return (Criteria) this;
        }

        public Criteria andInviteNumberIsNotNull() {
            addCriterion("invite_number is not null");
            return (Criteria) this;
        }

        public Criteria andInviteNumberEqualTo(String value) {
            addCriterion("invite_number =", value, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberNotEqualTo(String value) {
            addCriterion("invite_number <>", value, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberGreaterThan(String value) {
            addCriterion("invite_number >", value, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberGreaterThanOrEqualTo(String value) {
            addCriterion("invite_number >=", value, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberLessThan(String value) {
            addCriterion("invite_number <", value, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberLessThanOrEqualTo(String value) {
            addCriterion("invite_number <=", value, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberLike(String value) {
            addCriterion("invite_number like", value, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberNotLike(String value) {
            addCriterion("invite_number not like", value, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberIn(List<String> values) {
            addCriterion("invite_number in", values, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberNotIn(List<String> values) {
            addCriterion("invite_number not in", values, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberBetween(String value1, String value2) {
            addCriterion("invite_number between", value1, value2, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberNotBetween(String value1, String value2) {
            addCriterion("invite_number not between", value1, value2, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeValuesIsNull() {
            addCriterion("order_type_values is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeValuesIsNotNull() {
            addCriterion("order_type_values is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeValuesEqualTo(String value) {
            addCriterion("order_type_values =", value, "orderTypeValues");
            return (Criteria) this;
        }

        public Criteria andOrderTypeValuesNotEqualTo(String value) {
            addCriterion("order_type_values <>", value, "orderTypeValues");
            return (Criteria) this;
        }

        public Criteria andOrderTypeValuesGreaterThan(String value) {
            addCriterion("order_type_values >", value, "orderTypeValues");
            return (Criteria) this;
        }

        public Criteria andOrderTypeValuesGreaterThanOrEqualTo(String value) {
            addCriterion("order_type_values >=", value, "orderTypeValues");
            return (Criteria) this;
        }

        public Criteria andOrderTypeValuesLessThan(String value) {
            addCriterion("order_type_values <", value, "orderTypeValues");
            return (Criteria) this;
        }

        public Criteria andOrderTypeValuesLessThanOrEqualTo(String value) {
            addCriterion("order_type_values <=", value, "orderTypeValues");
            return (Criteria) this;
        }

        public Criteria andOrderTypeValuesLike(String value) {
            addCriterion("order_type_values like", value, "orderTypeValues");
            return (Criteria) this;
        }

        public Criteria andOrderTypeValuesNotLike(String value) {
            addCriterion("order_type_values not like", value, "orderTypeValues");
            return (Criteria) this;
        }

        public Criteria andOrderTypeValuesIn(List<String> values) {
            addCriterion("order_type_values in", values, "orderTypeValues");
            return (Criteria) this;
        }

        public Criteria andOrderTypeValuesNotIn(List<String> values) {
            addCriterion("order_type_values not in", values, "orderTypeValues");
            return (Criteria) this;
        }

        public Criteria andOrderTypeValuesBetween(String value1, String value2) {
            addCriterion("order_type_values between", value1, value2, "orderTypeValues");
            return (Criteria) this;
        }

        public Criteria andOrderTypeValuesNotBetween(String value1, String value2) {
            addCriterion("order_type_values not between", value1, value2, "orderTypeValues");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuTelphoneIsNull() {
            addCriterion("stu_telphone is null");
            return (Criteria) this;
        }

        public Criteria andStuTelphoneIsNotNull() {
            addCriterion("stu_telphone is not null");
            return (Criteria) this;
        }

        public Criteria andStuTelphoneEqualTo(String value) {
            addCriterion("stu_telphone =", value, "stuTelphone");
            return (Criteria) this;
        }

        public Criteria andStuTelphoneNotEqualTo(String value) {
            addCriterion("stu_telphone <>", value, "stuTelphone");
            return (Criteria) this;
        }

        public Criteria andStuTelphoneGreaterThan(String value) {
            addCriterion("stu_telphone >", value, "stuTelphone");
            return (Criteria) this;
        }

        public Criteria andStuTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("stu_telphone >=", value, "stuTelphone");
            return (Criteria) this;
        }

        public Criteria andStuTelphoneLessThan(String value) {
            addCriterion("stu_telphone <", value, "stuTelphone");
            return (Criteria) this;
        }

        public Criteria andStuTelphoneLessThanOrEqualTo(String value) {
            addCriterion("stu_telphone <=", value, "stuTelphone");
            return (Criteria) this;
        }

        public Criteria andStuTelphoneLike(String value) {
            addCriterion("stu_telphone like", value, "stuTelphone");
            return (Criteria) this;
        }

        public Criteria andStuTelphoneNotLike(String value) {
            addCriterion("stu_telphone not like", value, "stuTelphone");
            return (Criteria) this;
        }

        public Criteria andStuTelphoneIn(List<String> values) {
            addCriterion("stu_telphone in", values, "stuTelphone");
            return (Criteria) this;
        }

        public Criteria andStuTelphoneNotIn(List<String> values) {
            addCriterion("stu_telphone not in", values, "stuTelphone");
            return (Criteria) this;
        }

        public Criteria andStuTelphoneBetween(String value1, String value2) {
            addCriterion("stu_telphone between", value1, value2, "stuTelphone");
            return (Criteria) this;
        }

        public Criteria andStuTelphoneNotBetween(String value1, String value2) {
            addCriterion("stu_telphone not between", value1, value2, "stuTelphone");
            return (Criteria) this;
        }

        public Criteria andStuHighSchoolIsNull() {
            addCriterion("stu_high_school is null");
            return (Criteria) this;
        }

        public Criteria andStuHighSchoolIsNotNull() {
            addCriterion("stu_high_school is not null");
            return (Criteria) this;
        }

        public Criteria andStuHighSchoolEqualTo(String value) {
            addCriterion("stu_high_school =", value, "stuHighSchool");
            return (Criteria) this;
        }

        public Criteria andStuHighSchoolNotEqualTo(String value) {
            addCriterion("stu_high_school <>", value, "stuHighSchool");
            return (Criteria) this;
        }

        public Criteria andStuHighSchoolGreaterThan(String value) {
            addCriterion("stu_high_school >", value, "stuHighSchool");
            return (Criteria) this;
        }

        public Criteria andStuHighSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("stu_high_school >=", value, "stuHighSchool");
            return (Criteria) this;
        }

        public Criteria andStuHighSchoolLessThan(String value) {
            addCriterion("stu_high_school <", value, "stuHighSchool");
            return (Criteria) this;
        }

        public Criteria andStuHighSchoolLessThanOrEqualTo(String value) {
            addCriterion("stu_high_school <=", value, "stuHighSchool");
            return (Criteria) this;
        }

        public Criteria andStuHighSchoolLike(String value) {
            addCriterion("stu_high_school like", value, "stuHighSchool");
            return (Criteria) this;
        }

        public Criteria andStuHighSchoolNotLike(String value) {
            addCriterion("stu_high_school not like", value, "stuHighSchool");
            return (Criteria) this;
        }

        public Criteria andStuHighSchoolIn(List<String> values) {
            addCriterion("stu_high_school in", values, "stuHighSchool");
            return (Criteria) this;
        }

        public Criteria andStuHighSchoolNotIn(List<String> values) {
            addCriterion("stu_high_school not in", values, "stuHighSchool");
            return (Criteria) this;
        }

        public Criteria andStuHighSchoolBetween(String value1, String value2) {
            addCriterion("stu_high_school between", value1, value2, "stuHighSchool");
            return (Criteria) this;
        }

        public Criteria andStuHighSchoolNotBetween(String value1, String value2) {
            addCriterion("stu_high_school not between", value1, value2, "stuHighSchool");
            return (Criteria) this;
        }

        public Criteria andConsultSchoolIsNull() {
            addCriterion("consult_school is null");
            return (Criteria) this;
        }

        public Criteria andConsultSchoolIsNotNull() {
            addCriterion("consult_school is not null");
            return (Criteria) this;
        }

        public Criteria andConsultSchoolEqualTo(String value) {
            addCriterion("consult_school =", value, "consultSchool");
            return (Criteria) this;
        }

        public Criteria andConsultSchoolNotEqualTo(String value) {
            addCriterion("consult_school <>", value, "consultSchool");
            return (Criteria) this;
        }

        public Criteria andConsultSchoolGreaterThan(String value) {
            addCriterion("consult_school >", value, "consultSchool");
            return (Criteria) this;
        }

        public Criteria andConsultSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("consult_school >=", value, "consultSchool");
            return (Criteria) this;
        }

        public Criteria andConsultSchoolLessThan(String value) {
            addCriterion("consult_school <", value, "consultSchool");
            return (Criteria) this;
        }

        public Criteria andConsultSchoolLessThanOrEqualTo(String value) {
            addCriterion("consult_school <=", value, "consultSchool");
            return (Criteria) this;
        }

        public Criteria andConsultSchoolLike(String value) {
            addCriterion("consult_school like", value, "consultSchool");
            return (Criteria) this;
        }

        public Criteria andConsultSchoolNotLike(String value) {
            addCriterion("consult_school not like", value, "consultSchool");
            return (Criteria) this;
        }

        public Criteria andConsultSchoolIn(List<String> values) {
            addCriterion("consult_school in", values, "consultSchool");
            return (Criteria) this;
        }

        public Criteria andConsultSchoolNotIn(List<String> values) {
            addCriterion("consult_school not in", values, "consultSchool");
            return (Criteria) this;
        }

        public Criteria andConsultSchoolBetween(String value1, String value2) {
            addCriterion("consult_school between", value1, value2, "consultSchool");
            return (Criteria) this;
        }

        public Criteria andConsultSchoolNotBetween(String value1, String value2) {
            addCriterion("consult_school not between", value1, value2, "consultSchool");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceIsNull() {
            addCriterion("advisory_source is null");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceIsNotNull() {
            addCriterion("advisory_source is not null");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceEqualTo(String value) {
            addCriterion("advisory_source =", value, "advisorySource");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceNotEqualTo(String value) {
            addCriterion("advisory_source <>", value, "advisorySource");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceGreaterThan(String value) {
            addCriterion("advisory_source >", value, "advisorySource");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceGreaterThanOrEqualTo(String value) {
            addCriterion("advisory_source >=", value, "advisorySource");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceLessThan(String value) {
            addCriterion("advisory_source <", value, "advisorySource");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceLessThanOrEqualTo(String value) {
            addCriterion("advisory_source <=", value, "advisorySource");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceLike(String value) {
            addCriterion("advisory_source like", value, "advisorySource");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceNotLike(String value) {
            addCriterion("advisory_source not like", value, "advisorySource");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceIn(List<String> values) {
            addCriterion("advisory_source in", values, "advisorySource");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceNotIn(List<String> values) {
            addCriterion("advisory_source not in", values, "advisorySource");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceBetween(String value1, String value2) {
            addCriterion("advisory_source between", value1, value2, "advisorySource");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceNotBetween(String value1, String value2) {
            addCriterion("advisory_source not between", value1, value2, "advisorySource");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceValuesIsNull() {
            addCriterion("advisory_source_values is null");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceValuesIsNotNull() {
            addCriterion("advisory_source_values is not null");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceValuesEqualTo(String value) {
            addCriterion("advisory_source_values =", value, "advisorySourceValues");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceValuesNotEqualTo(String value) {
            addCriterion("advisory_source_values <>", value, "advisorySourceValues");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceValuesGreaterThan(String value) {
            addCriterion("advisory_source_values >", value, "advisorySourceValues");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceValuesGreaterThanOrEqualTo(String value) {
            addCriterion("advisory_source_values >=", value, "advisorySourceValues");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceValuesLessThan(String value) {
            addCriterion("advisory_source_values <", value, "advisorySourceValues");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceValuesLessThanOrEqualTo(String value) {
            addCriterion("advisory_source_values <=", value, "advisorySourceValues");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceValuesLike(String value) {
            addCriterion("advisory_source_values like", value, "advisorySourceValues");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceValuesNotLike(String value) {
            addCriterion("advisory_source_values not like", value, "advisorySourceValues");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceValuesIn(List<String> values) {
            addCriterion("advisory_source_values in", values, "advisorySourceValues");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceValuesNotIn(List<String> values) {
            addCriterion("advisory_source_values not in", values, "advisorySourceValues");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceValuesBetween(String value1, String value2) {
            addCriterion("advisory_source_values between", value1, value2, "advisorySourceValues");
            return (Criteria) this;
        }

        public Criteria andAdvisorySourceValuesNotBetween(String value1, String value2) {
            addCriterion("advisory_source_values not between", value1, value2, "advisorySourceValues");
            return (Criteria) this;
        }

        public Criteria andIsCardIsNull() {
            addCriterion("is_card is null");
            return (Criteria) this;
        }

        public Criteria andIsCardIsNotNull() {
            addCriterion("is_card is not null");
            return (Criteria) this;
        }

        public Criteria andIsCardEqualTo(String value) {
            addCriterion("is_card =", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotEqualTo(String value) {
            addCriterion("is_card <>", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardGreaterThan(String value) {
            addCriterion("is_card >", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardGreaterThanOrEqualTo(String value) {
            addCriterion("is_card >=", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardLessThan(String value) {
            addCriterion("is_card <", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardLessThanOrEqualTo(String value) {
            addCriterion("is_card <=", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardLike(String value) {
            addCriterion("is_card like", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotLike(String value) {
            addCriterion("is_card not like", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardIn(List<String> values) {
            addCriterion("is_card in", values, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotIn(List<String> values) {
            addCriterion("is_card not in", values, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardBetween(String value1, String value2) {
            addCriterion("is_card between", value1, value2, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotBetween(String value1, String value2) {
            addCriterion("is_card not between", value1, value2, "isCard");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkExtendIsNull() {
            addCriterion("remark_extend is null");
            return (Criteria) this;
        }

        public Criteria andRemarkExtendIsNotNull() {
            addCriterion("remark_extend is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkExtendEqualTo(String value) {
            addCriterion("remark_extend =", value, "remarkExtend");
            return (Criteria) this;
        }

        public Criteria andRemarkExtendNotEqualTo(String value) {
            addCriterion("remark_extend <>", value, "remarkExtend");
            return (Criteria) this;
        }

        public Criteria andRemarkExtendGreaterThan(String value) {
            addCriterion("remark_extend >", value, "remarkExtend");
            return (Criteria) this;
        }

        public Criteria andRemarkExtendGreaterThanOrEqualTo(String value) {
            addCriterion("remark_extend >=", value, "remarkExtend");
            return (Criteria) this;
        }

        public Criteria andRemarkExtendLessThan(String value) {
            addCriterion("remark_extend <", value, "remarkExtend");
            return (Criteria) this;
        }

        public Criteria andRemarkExtendLessThanOrEqualTo(String value) {
            addCriterion("remark_extend <=", value, "remarkExtend");
            return (Criteria) this;
        }

        public Criteria andRemarkExtendLike(String value) {
            addCriterion("remark_extend like", value, "remarkExtend");
            return (Criteria) this;
        }

        public Criteria andRemarkExtendNotLike(String value) {
            addCriterion("remark_extend not like", value, "remarkExtend");
            return (Criteria) this;
        }

        public Criteria andRemarkExtendIn(List<String> values) {
            addCriterion("remark_extend in", values, "remarkExtend");
            return (Criteria) this;
        }

        public Criteria andRemarkExtendNotIn(List<String> values) {
            addCriterion("remark_extend not in", values, "remarkExtend");
            return (Criteria) this;
        }

        public Criteria andRemarkExtendBetween(String value1, String value2) {
            addCriterion("remark_extend between", value1, value2, "remarkExtend");
            return (Criteria) this;
        }

        public Criteria andRemarkExtendNotBetween(String value1, String value2) {
            addCriterion("remark_extend not between", value1, value2, "remarkExtend");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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