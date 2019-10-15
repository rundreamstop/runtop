package com.deao.dal.daomain.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDetailModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailModelExample() {
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

        public Criteria andDetailNoIsNull() {
            addCriterion("detail_no is null");
            return (Criteria) this;
        }

        public Criteria andDetailNoIsNotNull() {
            addCriterion("detail_no is not null");
            return (Criteria) this;
        }

        public Criteria andDetailNoEqualTo(String value) {
            addCriterion("detail_no =", value, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoNotEqualTo(String value) {
            addCriterion("detail_no <>", value, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoGreaterThan(String value) {
            addCriterion("detail_no >", value, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoGreaterThanOrEqualTo(String value) {
            addCriterion("detail_no >=", value, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoLessThan(String value) {
            addCriterion("detail_no <", value, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoLessThanOrEqualTo(String value) {
            addCriterion("detail_no <=", value, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoLike(String value) {
            addCriterion("detail_no like", value, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoNotLike(String value) {
            addCriterion("detail_no not like", value, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoIn(List<String> values) {
            addCriterion("detail_no in", values, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoNotIn(List<String> values) {
            addCriterion("detail_no not in", values, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoBetween(String value1, String value2) {
            addCriterion("detail_no between", value1, value2, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoNotBetween(String value1, String value2) {
            addCriterion("detail_no not between", value1, value2, "detailNo");
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

        public Criteria andSchoolCodeIsNull() {
            addCriterion("school_code is null");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeIsNotNull() {
            addCriterion("school_code is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeEqualTo(String value) {
            addCriterion("school_code =", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotEqualTo(String value) {
            addCriterion("school_code <>", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeGreaterThan(String value) {
            addCriterion("school_code >", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeGreaterThanOrEqualTo(String value) {
            addCriterion("school_code >=", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeLessThan(String value) {
            addCriterion("school_code <", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeLessThanOrEqualTo(String value) {
            addCriterion("school_code <=", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeLike(String value) {
            addCriterion("school_code like", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotLike(String value) {
            addCriterion("school_code not like", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeIn(List<String> values) {
            addCriterion("school_code in", values, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotIn(List<String> values) {
            addCriterion("school_code not in", values, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeBetween(String value1, String value2) {
            addCriterion("school_code between", value1, value2, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotBetween(String value1, String value2) {
            addCriterion("school_code not between", value1, value2, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNull() {
            addCriterion("school_name is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("school_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("school_name =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("school_name <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("school_name >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("school_name >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("school_name <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("school_name <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("school_name like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("school_name not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("school_name in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("school_name not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("school_name between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("school_name not between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNull() {
            addCriterion("major_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNotNull() {
            addCriterion("major_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorIdEqualTo(Integer value) {
            addCriterion("major_id =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(Integer value) {
            addCriterion("major_id <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(Integer value) {
            addCriterion("major_id >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("major_id >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(Integer value) {
            addCriterion("major_id <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(Integer value) {
            addCriterion("major_id <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<Integer> values) {
            addCriterion("major_id in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<Integer> values) {
            addCriterion("major_id not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(Integer value1, Integer value2) {
            addCriterion("major_id between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("major_id not between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorCodeIsNull() {
            addCriterion("major_code is null");
            return (Criteria) this;
        }

        public Criteria andMajorCodeIsNotNull() {
            addCriterion("major_code is not null");
            return (Criteria) this;
        }

        public Criteria andMajorCodeEqualTo(String value) {
            addCriterion("major_code =", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeNotEqualTo(String value) {
            addCriterion("major_code <>", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeGreaterThan(String value) {
            addCriterion("major_code >", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("major_code >=", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeLessThan(String value) {
            addCriterion("major_code <", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeLessThanOrEqualTo(String value) {
            addCriterion("major_code <=", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeLike(String value) {
            addCriterion("major_code like", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeNotLike(String value) {
            addCriterion("major_code not like", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeIn(List<String> values) {
            addCriterion("major_code in", values, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeNotIn(List<String> values) {
            addCriterion("major_code not in", values, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeBetween(String value1, String value2) {
            addCriterion("major_code between", value1, value2, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeNotBetween(String value1, String value2) {
            addCriterion("major_code not between", value1, value2, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNull() {
            addCriterion("major_name is null");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNotNull() {
            addCriterion("major_name is not null");
            return (Criteria) this;
        }

        public Criteria andMajorNameEqualTo(String value) {
            addCriterion("major_name =", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotEqualTo(String value) {
            addCriterion("major_name <>", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThan(String value) {
            addCriterion("major_name >", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("major_name >=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThan(String value) {
            addCriterion("major_name <", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThanOrEqualTo(String value) {
            addCriterion("major_name <=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLike(String value) {
            addCriterion("major_name like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotLike(String value) {
            addCriterion("major_name not like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameIn(List<String> values) {
            addCriterion("major_name in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotIn(List<String> values) {
            addCriterion("major_name not in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameBetween(String value1, String value2) {
            addCriterion("major_name between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotBetween(String value1, String value2) {
            addCriterion("major_name not between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andGradeVolunteerIsNull() {
            addCriterion("grade_volunteer is null");
            return (Criteria) this;
        }

        public Criteria andGradeVolunteerIsNotNull() {
            addCriterion("grade_volunteer is not null");
            return (Criteria) this;
        }

        public Criteria andGradeVolunteerEqualTo(String value) {
            addCriterion("grade_volunteer =", value, "gradeVolunteer");
            return (Criteria) this;
        }

        public Criteria andGradeVolunteerNotEqualTo(String value) {
            addCriterion("grade_volunteer <>", value, "gradeVolunteer");
            return (Criteria) this;
        }

        public Criteria andGradeVolunteerGreaterThan(String value) {
            addCriterion("grade_volunteer >", value, "gradeVolunteer");
            return (Criteria) this;
        }

        public Criteria andGradeVolunteerGreaterThanOrEqualTo(String value) {
            addCriterion("grade_volunteer >=", value, "gradeVolunteer");
            return (Criteria) this;
        }

        public Criteria andGradeVolunteerLessThan(String value) {
            addCriterion("grade_volunteer <", value, "gradeVolunteer");
            return (Criteria) this;
        }

        public Criteria andGradeVolunteerLessThanOrEqualTo(String value) {
            addCriterion("grade_volunteer <=", value, "gradeVolunteer");
            return (Criteria) this;
        }

        public Criteria andGradeVolunteerLike(String value) {
            addCriterion("grade_volunteer like", value, "gradeVolunteer");
            return (Criteria) this;
        }

        public Criteria andGradeVolunteerNotLike(String value) {
            addCriterion("grade_volunteer not like", value, "gradeVolunteer");
            return (Criteria) this;
        }

        public Criteria andGradeVolunteerIn(List<String> values) {
            addCriterion("grade_volunteer in", values, "gradeVolunteer");
            return (Criteria) this;
        }

        public Criteria andGradeVolunteerNotIn(List<String> values) {
            addCriterion("grade_volunteer not in", values, "gradeVolunteer");
            return (Criteria) this;
        }

        public Criteria andGradeVolunteerBetween(String value1, String value2) {
            addCriterion("grade_volunteer between", value1, value2, "gradeVolunteer");
            return (Criteria) this;
        }

        public Criteria andGradeVolunteerNotBetween(String value1, String value2) {
            addCriterion("grade_volunteer not between", value1, value2, "gradeVolunteer");
            return (Criteria) this;
        }

        public Criteria andGradeValunteerValuesIsNull() {
            addCriterion("grade_valunteer_values is null");
            return (Criteria) this;
        }

        public Criteria andGradeValunteerValuesIsNotNull() {
            addCriterion("grade_valunteer_values is not null");
            return (Criteria) this;
        }

        public Criteria andGradeValunteerValuesEqualTo(String value) {
            addCriterion("grade_valunteer_values =", value, "gradeValunteerValues");
            return (Criteria) this;
        }

        public Criteria andGradeValunteerValuesNotEqualTo(String value) {
            addCriterion("grade_valunteer_values <>", value, "gradeValunteerValues");
            return (Criteria) this;
        }

        public Criteria andGradeValunteerValuesGreaterThan(String value) {
            addCriterion("grade_valunteer_values >", value, "gradeValunteerValues");
            return (Criteria) this;
        }

        public Criteria andGradeValunteerValuesGreaterThanOrEqualTo(String value) {
            addCriterion("grade_valunteer_values >=", value, "gradeValunteerValues");
            return (Criteria) this;
        }

        public Criteria andGradeValunteerValuesLessThan(String value) {
            addCriterion("grade_valunteer_values <", value, "gradeValunteerValues");
            return (Criteria) this;
        }

        public Criteria andGradeValunteerValuesLessThanOrEqualTo(String value) {
            addCriterion("grade_valunteer_values <=", value, "gradeValunteerValues");
            return (Criteria) this;
        }

        public Criteria andGradeValunteerValuesLike(String value) {
            addCriterion("grade_valunteer_values like", value, "gradeValunteerValues");
            return (Criteria) this;
        }

        public Criteria andGradeValunteerValuesNotLike(String value) {
            addCriterion("grade_valunteer_values not like", value, "gradeValunteerValues");
            return (Criteria) this;
        }

        public Criteria andGradeValunteerValuesIn(List<String> values) {
            addCriterion("grade_valunteer_values in", values, "gradeValunteerValues");
            return (Criteria) this;
        }

        public Criteria andGradeValunteerValuesNotIn(List<String> values) {
            addCriterion("grade_valunteer_values not in", values, "gradeValunteerValues");
            return (Criteria) this;
        }

        public Criteria andGradeValunteerValuesBetween(String value1, String value2) {
            addCriterion("grade_valunteer_values between", value1, value2, "gradeValunteerValues");
            return (Criteria) this;
        }

        public Criteria andGradeValunteerValuesNotBetween(String value1, String value2) {
            addCriterion("grade_valunteer_values not between", value1, value2, "gradeValunteerValues");
            return (Criteria) this;
        }

        public Criteria andReportingConditionsIsNull() {
            addCriterion("reporting_conditions is null");
            return (Criteria) this;
        }

        public Criteria andReportingConditionsIsNotNull() {
            addCriterion("reporting_conditions is not null");
            return (Criteria) this;
        }

        public Criteria andReportingConditionsEqualTo(String value) {
            addCriterion("reporting_conditions =", value, "reportingConditions");
            return (Criteria) this;
        }

        public Criteria andReportingConditionsNotEqualTo(String value) {
            addCriterion("reporting_conditions <>", value, "reportingConditions");
            return (Criteria) this;
        }

        public Criteria andReportingConditionsGreaterThan(String value) {
            addCriterion("reporting_conditions >", value, "reportingConditions");
            return (Criteria) this;
        }

        public Criteria andReportingConditionsGreaterThanOrEqualTo(String value) {
            addCriterion("reporting_conditions >=", value, "reportingConditions");
            return (Criteria) this;
        }

        public Criteria andReportingConditionsLessThan(String value) {
            addCriterion("reporting_conditions <", value, "reportingConditions");
            return (Criteria) this;
        }

        public Criteria andReportingConditionsLessThanOrEqualTo(String value) {
            addCriterion("reporting_conditions <=", value, "reportingConditions");
            return (Criteria) this;
        }

        public Criteria andReportingConditionsLike(String value) {
            addCriterion("reporting_conditions like", value, "reportingConditions");
            return (Criteria) this;
        }

        public Criteria andReportingConditionsNotLike(String value) {
            addCriterion("reporting_conditions not like", value, "reportingConditions");
            return (Criteria) this;
        }

        public Criteria andReportingConditionsIn(List<String> values) {
            addCriterion("reporting_conditions in", values, "reportingConditions");
            return (Criteria) this;
        }

        public Criteria andReportingConditionsNotIn(List<String> values) {
            addCriterion("reporting_conditions not in", values, "reportingConditions");
            return (Criteria) this;
        }

        public Criteria andReportingConditionsBetween(String value1, String value2) {
            addCriterion("reporting_conditions between", value1, value2, "reportingConditions");
            return (Criteria) this;
        }

        public Criteria andReportingConditionsNotBetween(String value1, String value2) {
            addCriterion("reporting_conditions not between", value1, value2, "reportingConditions");
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