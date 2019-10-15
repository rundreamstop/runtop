package com.deao.dal.daomain.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemIntegrationConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemIntegrationConfigExample() {
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

        public Criteria andIntegrationTypeIsNull() {
            addCriterion("integration_type is null");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeIsNotNull() {
            addCriterion("integration_type is not null");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeEqualTo(String value) {
            addCriterion("integration_type =", value, "integrationType");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeNotEqualTo(String value) {
            addCriterion("integration_type <>", value, "integrationType");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeGreaterThan(String value) {
            addCriterion("integration_type >", value, "integrationType");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("integration_type >=", value, "integrationType");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeLessThan(String value) {
            addCriterion("integration_type <", value, "integrationType");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeLessThanOrEqualTo(String value) {
            addCriterion("integration_type <=", value, "integrationType");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeLike(String value) {
            addCriterion("integration_type like", value, "integrationType");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeNotLike(String value) {
            addCriterion("integration_type not like", value, "integrationType");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeIn(List<String> values) {
            addCriterion("integration_type in", values, "integrationType");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeNotIn(List<String> values) {
            addCriterion("integration_type not in", values, "integrationType");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeBetween(String value1, String value2) {
            addCriterion("integration_type between", value1, value2, "integrationType");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeNotBetween(String value1, String value2) {
            addCriterion("integration_type not between", value1, value2, "integrationType");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeValuesIsNull() {
            addCriterion("integration_type_values is null");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeValuesIsNotNull() {
            addCriterion("integration_type_values is not null");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeValuesEqualTo(String value) {
            addCriterion("integration_type_values =", value, "integrationTypeValues");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeValuesNotEqualTo(String value) {
            addCriterion("integration_type_values <>", value, "integrationTypeValues");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeValuesGreaterThan(String value) {
            addCriterion("integration_type_values >", value, "integrationTypeValues");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeValuesGreaterThanOrEqualTo(String value) {
            addCriterion("integration_type_values >=", value, "integrationTypeValues");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeValuesLessThan(String value) {
            addCriterion("integration_type_values <", value, "integrationTypeValues");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeValuesLessThanOrEqualTo(String value) {
            addCriterion("integration_type_values <=", value, "integrationTypeValues");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeValuesLike(String value) {
            addCriterion("integration_type_values like", value, "integrationTypeValues");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeValuesNotLike(String value) {
            addCriterion("integration_type_values not like", value, "integrationTypeValues");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeValuesIn(List<String> values) {
            addCriterion("integration_type_values in", values, "integrationTypeValues");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeValuesNotIn(List<String> values) {
            addCriterion("integration_type_values not in", values, "integrationTypeValues");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeValuesBetween(String value1, String value2) {
            addCriterion("integration_type_values between", value1, value2, "integrationTypeValues");
            return (Criteria) this;
        }

        public Criteria andIntegrationTypeValuesNotBetween(String value1, String value2) {
            addCriterion("integration_type_values not between", value1, value2, "integrationTypeValues");
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