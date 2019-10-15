package com.deao.dal.daomain.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduDictionaryModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduDictionaryModelExample() {
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

        public Criteria andDictionaryTypeIsNull() {
            addCriterion("dictionary_type is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIsNotNull() {
            addCriterion("dictionary_type is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeEqualTo(String value) {
            addCriterion("dictionary_type =", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNotEqualTo(String value) {
            addCriterion("dictionary_type <>", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeGreaterThan(String value) {
            addCriterion("dictionary_type >", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_type >=", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeLessThan(String value) {
            addCriterion("dictionary_type <", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeLessThanOrEqualTo(String value) {
            addCriterion("dictionary_type <=", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeLike(String value) {
            addCriterion("dictionary_type like", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNotLike(String value) {
            addCriterion("dictionary_type not like", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIn(List<String> values) {
            addCriterion("dictionary_type in", values, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNotIn(List<String> values) {
            addCriterion("dictionary_type not in", values, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeBetween(String value1, String value2) {
            addCriterion("dictionary_type between", value1, value2, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNotBetween(String value1, String value2) {
            addCriterion("dictionary_type not between", value1, value2, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValuesIsNull() {
            addCriterion("dictionary_type_values is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValuesIsNotNull() {
            addCriterion("dictionary_type_values is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValuesEqualTo(String value) {
            addCriterion("dictionary_type_values =", value, "dictionaryTypeValues");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValuesNotEqualTo(String value) {
            addCriterion("dictionary_type_values <>", value, "dictionaryTypeValues");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValuesGreaterThan(String value) {
            addCriterion("dictionary_type_values >", value, "dictionaryTypeValues");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValuesGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_type_values >=", value, "dictionaryTypeValues");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValuesLessThan(String value) {
            addCriterion("dictionary_type_values <", value, "dictionaryTypeValues");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValuesLessThanOrEqualTo(String value) {
            addCriterion("dictionary_type_values <=", value, "dictionaryTypeValues");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValuesLike(String value) {
            addCriterion("dictionary_type_values like", value, "dictionaryTypeValues");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValuesNotLike(String value) {
            addCriterion("dictionary_type_values not like", value, "dictionaryTypeValues");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValuesIn(List<String> values) {
            addCriterion("dictionary_type_values in", values, "dictionaryTypeValues");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValuesNotIn(List<String> values) {
            addCriterion("dictionary_type_values not in", values, "dictionaryTypeValues");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValuesBetween(String value1, String value2) {
            addCriterion("dictionary_type_values between", value1, value2, "dictionaryTypeValues");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValuesNotBetween(String value1, String value2) {
            addCriterion("dictionary_type_values not between", value1, value2, "dictionaryTypeValues");
            return (Criteria) this;
        }

        public Criteria andKeyCodeIsNull() {
            addCriterion("key_code is null");
            return (Criteria) this;
        }

        public Criteria andKeyCodeIsNotNull() {
            addCriterion("key_code is not null");
            return (Criteria) this;
        }

        public Criteria andKeyCodeEqualTo(String value) {
            addCriterion("key_code =", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeNotEqualTo(String value) {
            addCriterion("key_code <>", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeGreaterThan(String value) {
            addCriterion("key_code >", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("key_code >=", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeLessThan(String value) {
            addCriterion("key_code <", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeLessThanOrEqualTo(String value) {
            addCriterion("key_code <=", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeLike(String value) {
            addCriterion("key_code like", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeNotLike(String value) {
            addCriterion("key_code not like", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeIn(List<String> values) {
            addCriterion("key_code in", values, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeNotIn(List<String> values) {
            addCriterion("key_code not in", values, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeBetween(String value1, String value2) {
            addCriterion("key_code between", value1, value2, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeNotBetween(String value1, String value2) {
            addCriterion("key_code not between", value1, value2, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyValuesIsNull() {
            addCriterion("key_values is null");
            return (Criteria) this;
        }

        public Criteria andKeyValuesIsNotNull() {
            addCriterion("key_values is not null");
            return (Criteria) this;
        }

        public Criteria andKeyValuesEqualTo(String value) {
            addCriterion("key_values =", value, "keyValues");
            return (Criteria) this;
        }

        public Criteria andKeyValuesNotEqualTo(String value) {
            addCriterion("key_values <>", value, "keyValues");
            return (Criteria) this;
        }

        public Criteria andKeyValuesGreaterThan(String value) {
            addCriterion("key_values >", value, "keyValues");
            return (Criteria) this;
        }

        public Criteria andKeyValuesGreaterThanOrEqualTo(String value) {
            addCriterion("key_values >=", value, "keyValues");
            return (Criteria) this;
        }

        public Criteria andKeyValuesLessThan(String value) {
            addCriterion("key_values <", value, "keyValues");
            return (Criteria) this;
        }

        public Criteria andKeyValuesLessThanOrEqualTo(String value) {
            addCriterion("key_values <=", value, "keyValues");
            return (Criteria) this;
        }

        public Criteria andKeyValuesLike(String value) {
            addCriterion("key_values like", value, "keyValues");
            return (Criteria) this;
        }

        public Criteria andKeyValuesNotLike(String value) {
            addCriterion("key_values not like", value, "keyValues");
            return (Criteria) this;
        }

        public Criteria andKeyValuesIn(List<String> values) {
            addCriterion("key_values in", values, "keyValues");
            return (Criteria) this;
        }

        public Criteria andKeyValuesNotIn(List<String> values) {
            addCriterion("key_values not in", values, "keyValues");
            return (Criteria) this;
        }

        public Criteria andKeyValuesBetween(String value1, String value2) {
            addCriterion("key_values between", value1, value2, "keyValues");
            return (Criteria) this;
        }

        public Criteria andKeyValuesNotBetween(String value1, String value2) {
            addCriterion("key_values not between", value1, value2, "keyValues");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("sort not between", value1, value2, "sort");
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