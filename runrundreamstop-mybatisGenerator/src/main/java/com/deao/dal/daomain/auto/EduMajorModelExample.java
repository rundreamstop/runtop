package com.deao.dal.daomain.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduMajorModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduMajorModelExample() {
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

        public Criteria andMajorBigCategoryIsNull() {
            addCriterion("major_big_category is null");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryIsNotNull() {
            addCriterion("major_big_category is not null");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryEqualTo(String value) {
            addCriterion("major_big_category =", value, "majorBigCategory");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryNotEqualTo(String value) {
            addCriterion("major_big_category <>", value, "majorBigCategory");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryGreaterThan(String value) {
            addCriterion("major_big_category >", value, "majorBigCategory");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("major_big_category >=", value, "majorBigCategory");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryLessThan(String value) {
            addCriterion("major_big_category <", value, "majorBigCategory");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryLessThanOrEqualTo(String value) {
            addCriterion("major_big_category <=", value, "majorBigCategory");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryLike(String value) {
            addCriterion("major_big_category like", value, "majorBigCategory");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryNotLike(String value) {
            addCriterion("major_big_category not like", value, "majorBigCategory");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryIn(List<String> values) {
            addCriterion("major_big_category in", values, "majorBigCategory");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryNotIn(List<String> values) {
            addCriterion("major_big_category not in", values, "majorBigCategory");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryBetween(String value1, String value2) {
            addCriterion("major_big_category between", value1, value2, "majorBigCategory");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryNotBetween(String value1, String value2) {
            addCriterion("major_big_category not between", value1, value2, "majorBigCategory");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryValuesIsNull() {
            addCriterion("major_big_category_values is null");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryValuesIsNotNull() {
            addCriterion("major_big_category_values is not null");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryValuesEqualTo(String value) {
            addCriterion("major_big_category_values =", value, "majorBigCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryValuesNotEqualTo(String value) {
            addCriterion("major_big_category_values <>", value, "majorBigCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryValuesGreaterThan(String value) {
            addCriterion("major_big_category_values >", value, "majorBigCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryValuesGreaterThanOrEqualTo(String value) {
            addCriterion("major_big_category_values >=", value, "majorBigCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryValuesLessThan(String value) {
            addCriterion("major_big_category_values <", value, "majorBigCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryValuesLessThanOrEqualTo(String value) {
            addCriterion("major_big_category_values <=", value, "majorBigCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryValuesLike(String value) {
            addCriterion("major_big_category_values like", value, "majorBigCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryValuesNotLike(String value) {
            addCriterion("major_big_category_values not like", value, "majorBigCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryValuesIn(List<String> values) {
            addCriterion("major_big_category_values in", values, "majorBigCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryValuesNotIn(List<String> values) {
            addCriterion("major_big_category_values not in", values, "majorBigCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryValuesBetween(String value1, String value2) {
            addCriterion("major_big_category_values between", value1, value2, "majorBigCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorBigCategoryValuesNotBetween(String value1, String value2) {
            addCriterion("major_big_category_values not between", value1, value2, "majorBigCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryIsNull() {
            addCriterion("major_category is null");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryIsNotNull() {
            addCriterion("major_category is not null");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryEqualTo(String value) {
            addCriterion("major_category =", value, "majorCategory");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryNotEqualTo(String value) {
            addCriterion("major_category <>", value, "majorCategory");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryGreaterThan(String value) {
            addCriterion("major_category >", value, "majorCategory");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("major_category >=", value, "majorCategory");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryLessThan(String value) {
            addCriterion("major_category <", value, "majorCategory");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryLessThanOrEqualTo(String value) {
            addCriterion("major_category <=", value, "majorCategory");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryLike(String value) {
            addCriterion("major_category like", value, "majorCategory");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryNotLike(String value) {
            addCriterion("major_category not like", value, "majorCategory");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryIn(List<String> values) {
            addCriterion("major_category in", values, "majorCategory");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryNotIn(List<String> values) {
            addCriterion("major_category not in", values, "majorCategory");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryBetween(String value1, String value2) {
            addCriterion("major_category between", value1, value2, "majorCategory");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryNotBetween(String value1, String value2) {
            addCriterion("major_category not between", value1, value2, "majorCategory");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryValuesIsNull() {
            addCriterion("major_category_values is null");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryValuesIsNotNull() {
            addCriterion("major_category_values is not null");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryValuesEqualTo(String value) {
            addCriterion("major_category_values =", value, "majorCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryValuesNotEqualTo(String value) {
            addCriterion("major_category_values <>", value, "majorCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryValuesGreaterThan(String value) {
            addCriterion("major_category_values >", value, "majorCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryValuesGreaterThanOrEqualTo(String value) {
            addCriterion("major_category_values >=", value, "majorCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryValuesLessThan(String value) {
            addCriterion("major_category_values <", value, "majorCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryValuesLessThanOrEqualTo(String value) {
            addCriterion("major_category_values <=", value, "majorCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryValuesLike(String value) {
            addCriterion("major_category_values like", value, "majorCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryValuesNotLike(String value) {
            addCriterion("major_category_values not like", value, "majorCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryValuesIn(List<String> values) {
            addCriterion("major_category_values in", values, "majorCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryValuesNotIn(List<String> values) {
            addCriterion("major_category_values not in", values, "majorCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryValuesBetween(String value1, String value2) {
            addCriterion("major_category_values between", value1, value2, "majorCategoryValues");
            return (Criteria) this;
        }

        public Criteria andMajorCategoryValuesNotBetween(String value1, String value2) {
            addCriterion("major_category_values not between", value1, value2, "majorCategoryValues");
            return (Criteria) this;
        }

        public Criteria andStuFacultyIsNull() {
            addCriterion("stu_faculty is null");
            return (Criteria) this;
        }

        public Criteria andStuFacultyIsNotNull() {
            addCriterion("stu_faculty is not null");
            return (Criteria) this;
        }

        public Criteria andStuFacultyEqualTo(String value) {
            addCriterion("stu_faculty =", value, "stuFaculty");
            return (Criteria) this;
        }

        public Criteria andStuFacultyNotEqualTo(String value) {
            addCriterion("stu_faculty <>", value, "stuFaculty");
            return (Criteria) this;
        }

        public Criteria andStuFacultyGreaterThan(String value) {
            addCriterion("stu_faculty >", value, "stuFaculty");
            return (Criteria) this;
        }

        public Criteria andStuFacultyGreaterThanOrEqualTo(String value) {
            addCriterion("stu_faculty >=", value, "stuFaculty");
            return (Criteria) this;
        }

        public Criteria andStuFacultyLessThan(String value) {
            addCriterion("stu_faculty <", value, "stuFaculty");
            return (Criteria) this;
        }

        public Criteria andStuFacultyLessThanOrEqualTo(String value) {
            addCriterion("stu_faculty <=", value, "stuFaculty");
            return (Criteria) this;
        }

        public Criteria andStuFacultyLike(String value) {
            addCriterion("stu_faculty like", value, "stuFaculty");
            return (Criteria) this;
        }

        public Criteria andStuFacultyNotLike(String value) {
            addCriterion("stu_faculty not like", value, "stuFaculty");
            return (Criteria) this;
        }

        public Criteria andStuFacultyIn(List<String> values) {
            addCriterion("stu_faculty in", values, "stuFaculty");
            return (Criteria) this;
        }

        public Criteria andStuFacultyNotIn(List<String> values) {
            addCriterion("stu_faculty not in", values, "stuFaculty");
            return (Criteria) this;
        }

        public Criteria andStuFacultyBetween(String value1, String value2) {
            addCriterion("stu_faculty between", value1, value2, "stuFaculty");
            return (Criteria) this;
        }

        public Criteria andStuFacultyNotBetween(String value1, String value2) {
            addCriterion("stu_faculty not between", value1, value2, "stuFaculty");
            return (Criteria) this;
        }

        public Criteria andStuFacultyValuesIsNull() {
            addCriterion("stu_faculty_values is null");
            return (Criteria) this;
        }

        public Criteria andStuFacultyValuesIsNotNull() {
            addCriterion("stu_faculty_values is not null");
            return (Criteria) this;
        }

        public Criteria andStuFacultyValuesEqualTo(String value) {
            addCriterion("stu_faculty_values =", value, "stuFacultyValues");
            return (Criteria) this;
        }

        public Criteria andStuFacultyValuesNotEqualTo(String value) {
            addCriterion("stu_faculty_values <>", value, "stuFacultyValues");
            return (Criteria) this;
        }

        public Criteria andStuFacultyValuesGreaterThan(String value) {
            addCriterion("stu_faculty_values >", value, "stuFacultyValues");
            return (Criteria) this;
        }

        public Criteria andStuFacultyValuesGreaterThanOrEqualTo(String value) {
            addCriterion("stu_faculty_values >=", value, "stuFacultyValues");
            return (Criteria) this;
        }

        public Criteria andStuFacultyValuesLessThan(String value) {
            addCriterion("stu_faculty_values <", value, "stuFacultyValues");
            return (Criteria) this;
        }

        public Criteria andStuFacultyValuesLessThanOrEqualTo(String value) {
            addCriterion("stu_faculty_values <=", value, "stuFacultyValues");
            return (Criteria) this;
        }

        public Criteria andStuFacultyValuesLike(String value) {
            addCriterion("stu_faculty_values like", value, "stuFacultyValues");
            return (Criteria) this;
        }

        public Criteria andStuFacultyValuesNotLike(String value) {
            addCriterion("stu_faculty_values not like", value, "stuFacultyValues");
            return (Criteria) this;
        }

        public Criteria andStuFacultyValuesIn(List<String> values) {
            addCriterion("stu_faculty_values in", values, "stuFacultyValues");
            return (Criteria) this;
        }

        public Criteria andStuFacultyValuesNotIn(List<String> values) {
            addCriterion("stu_faculty_values not in", values, "stuFacultyValues");
            return (Criteria) this;
        }

        public Criteria andStuFacultyValuesBetween(String value1, String value2) {
            addCriterion("stu_faculty_values between", value1, value2, "stuFacultyValues");
            return (Criteria) this;
        }

        public Criteria andStuFacultyValuesNotBetween(String value1, String value2) {
            addCriterion("stu_faculty_values not between", value1, value2, "stuFacultyValues");
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

        public Criteria andEduLevelIsNull() {
            addCriterion("edu_level is null");
            return (Criteria) this;
        }

        public Criteria andEduLevelIsNotNull() {
            addCriterion("edu_level is not null");
            return (Criteria) this;
        }

        public Criteria andEduLevelEqualTo(String value) {
            addCriterion("edu_level =", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelNotEqualTo(String value) {
            addCriterion("edu_level <>", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelGreaterThan(String value) {
            addCriterion("edu_level >", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelGreaterThanOrEqualTo(String value) {
            addCriterion("edu_level >=", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelLessThan(String value) {
            addCriterion("edu_level <", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelLessThanOrEqualTo(String value) {
            addCriterion("edu_level <=", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelLike(String value) {
            addCriterion("edu_level like", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelNotLike(String value) {
            addCriterion("edu_level not like", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelIn(List<String> values) {
            addCriterion("edu_level in", values, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelNotIn(List<String> values) {
            addCriterion("edu_level not in", values, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelBetween(String value1, String value2) {
            addCriterion("edu_level between", value1, value2, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelNotBetween(String value1, String value2) {
            addCriterion("edu_level not between", value1, value2, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelValuesIsNull() {
            addCriterion("edu_level_values is null");
            return (Criteria) this;
        }

        public Criteria andEduLevelValuesIsNotNull() {
            addCriterion("edu_level_values is not null");
            return (Criteria) this;
        }

        public Criteria andEduLevelValuesEqualTo(String value) {
            addCriterion("edu_level_values =", value, "eduLevelValues");
            return (Criteria) this;
        }

        public Criteria andEduLevelValuesNotEqualTo(String value) {
            addCriterion("edu_level_values <>", value, "eduLevelValues");
            return (Criteria) this;
        }

        public Criteria andEduLevelValuesGreaterThan(String value) {
            addCriterion("edu_level_values >", value, "eduLevelValues");
            return (Criteria) this;
        }

        public Criteria andEduLevelValuesGreaterThanOrEqualTo(String value) {
            addCriterion("edu_level_values >=", value, "eduLevelValues");
            return (Criteria) this;
        }

        public Criteria andEduLevelValuesLessThan(String value) {
            addCriterion("edu_level_values <", value, "eduLevelValues");
            return (Criteria) this;
        }

        public Criteria andEduLevelValuesLessThanOrEqualTo(String value) {
            addCriterion("edu_level_values <=", value, "eduLevelValues");
            return (Criteria) this;
        }

        public Criteria andEduLevelValuesLike(String value) {
            addCriterion("edu_level_values like", value, "eduLevelValues");
            return (Criteria) this;
        }

        public Criteria andEduLevelValuesNotLike(String value) {
            addCriterion("edu_level_values not like", value, "eduLevelValues");
            return (Criteria) this;
        }

        public Criteria andEduLevelValuesIn(List<String> values) {
            addCriterion("edu_level_values in", values, "eduLevelValues");
            return (Criteria) this;
        }

        public Criteria andEduLevelValuesNotIn(List<String> values) {
            addCriterion("edu_level_values not in", values, "eduLevelValues");
            return (Criteria) this;
        }

        public Criteria andEduLevelValuesBetween(String value1, String value2) {
            addCriterion("edu_level_values between", value1, value2, "eduLevelValues");
            return (Criteria) this;
        }

        public Criteria andEduLevelValuesNotBetween(String value1, String value2) {
            addCriterion("edu_level_values not between", value1, value2, "eduLevelValues");
            return (Criteria) this;
        }

        public Criteria andEduSystemIsNull() {
            addCriterion("edu_system is null");
            return (Criteria) this;
        }

        public Criteria andEduSystemIsNotNull() {
            addCriterion("edu_system is not null");
            return (Criteria) this;
        }

        public Criteria andEduSystemEqualTo(String value) {
            addCriterion("edu_system =", value, "eduSystem");
            return (Criteria) this;
        }

        public Criteria andEduSystemNotEqualTo(String value) {
            addCriterion("edu_system <>", value, "eduSystem");
            return (Criteria) this;
        }

        public Criteria andEduSystemGreaterThan(String value) {
            addCriterion("edu_system >", value, "eduSystem");
            return (Criteria) this;
        }

        public Criteria andEduSystemGreaterThanOrEqualTo(String value) {
            addCriterion("edu_system >=", value, "eduSystem");
            return (Criteria) this;
        }

        public Criteria andEduSystemLessThan(String value) {
            addCriterion("edu_system <", value, "eduSystem");
            return (Criteria) this;
        }

        public Criteria andEduSystemLessThanOrEqualTo(String value) {
            addCriterion("edu_system <=", value, "eduSystem");
            return (Criteria) this;
        }

        public Criteria andEduSystemLike(String value) {
            addCriterion("edu_system like", value, "eduSystem");
            return (Criteria) this;
        }

        public Criteria andEduSystemNotLike(String value) {
            addCriterion("edu_system not like", value, "eduSystem");
            return (Criteria) this;
        }

        public Criteria andEduSystemIn(List<String> values) {
            addCriterion("edu_system in", values, "eduSystem");
            return (Criteria) this;
        }

        public Criteria andEduSystemNotIn(List<String> values) {
            addCriterion("edu_system not in", values, "eduSystem");
            return (Criteria) this;
        }

        public Criteria andEduSystemBetween(String value1, String value2) {
            addCriterion("edu_system between", value1, value2, "eduSystem");
            return (Criteria) this;
        }

        public Criteria andEduSystemNotBetween(String value1, String value2) {
            addCriterion("edu_system not between", value1, value2, "eduSystem");
            return (Criteria) this;
        }

        public Criteria andStudyYearsIsNull() {
            addCriterion("study_years is null");
            return (Criteria) this;
        }

        public Criteria andStudyYearsIsNotNull() {
            addCriterion("study_years is not null");
            return (Criteria) this;
        }

        public Criteria andStudyYearsEqualTo(String value) {
            addCriterion("study_years =", value, "studyYears");
            return (Criteria) this;
        }

        public Criteria andStudyYearsNotEqualTo(String value) {
            addCriterion("study_years <>", value, "studyYears");
            return (Criteria) this;
        }

        public Criteria andStudyYearsGreaterThan(String value) {
            addCriterion("study_years >", value, "studyYears");
            return (Criteria) this;
        }

        public Criteria andStudyYearsGreaterThanOrEqualTo(String value) {
            addCriterion("study_years >=", value, "studyYears");
            return (Criteria) this;
        }

        public Criteria andStudyYearsLessThan(String value) {
            addCriterion("study_years <", value, "studyYears");
            return (Criteria) this;
        }

        public Criteria andStudyYearsLessThanOrEqualTo(String value) {
            addCriterion("study_years <=", value, "studyYears");
            return (Criteria) this;
        }

        public Criteria andStudyYearsLike(String value) {
            addCriterion("study_years like", value, "studyYears");
            return (Criteria) this;
        }

        public Criteria andStudyYearsNotLike(String value) {
            addCriterion("study_years not like", value, "studyYears");
            return (Criteria) this;
        }

        public Criteria andStudyYearsIn(List<String> values) {
            addCriterion("study_years in", values, "studyYears");
            return (Criteria) this;
        }

        public Criteria andStudyYearsNotIn(List<String> values) {
            addCriterion("study_years not in", values, "studyYears");
            return (Criteria) this;
        }

        public Criteria andStudyYearsBetween(String value1, String value2) {
            addCriterion("study_years between", value1, value2, "studyYears");
            return (Criteria) this;
        }

        public Criteria andStudyYearsNotBetween(String value1, String value2) {
            addCriterion("study_years not between", value1, value2, "studyYears");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTargetIsNull() {
            addCriterion("recruitment_target is null");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTargetIsNotNull() {
            addCriterion("recruitment_target is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTargetEqualTo(String value) {
            addCriterion("recruitment_target =", value, "recruitmentTarget");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTargetNotEqualTo(String value) {
            addCriterion("recruitment_target <>", value, "recruitmentTarget");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTargetGreaterThan(String value) {
            addCriterion("recruitment_target >", value, "recruitmentTarget");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTargetGreaterThanOrEqualTo(String value) {
            addCriterion("recruitment_target >=", value, "recruitmentTarget");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTargetLessThan(String value) {
            addCriterion("recruitment_target <", value, "recruitmentTarget");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTargetLessThanOrEqualTo(String value) {
            addCriterion("recruitment_target <=", value, "recruitmentTarget");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTargetLike(String value) {
            addCriterion("recruitment_target like", value, "recruitmentTarget");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTargetNotLike(String value) {
            addCriterion("recruitment_target not like", value, "recruitmentTarget");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTargetIn(List<String> values) {
            addCriterion("recruitment_target in", values, "recruitmentTarget");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTargetNotIn(List<String> values) {
            addCriterion("recruitment_target not in", values, "recruitmentTarget");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTargetBetween(String value1, String value2) {
            addCriterion("recruitment_target between", value1, value2, "recruitmentTarget");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTargetNotBetween(String value1, String value2) {
            addCriterion("recruitment_target not between", value1, value2, "recruitmentTarget");
            return (Criteria) this;
        }

        public Criteria andMajorDescribeIsNull() {
            addCriterion("major_describe is null");
            return (Criteria) this;
        }

        public Criteria andMajorDescribeIsNotNull() {
            addCriterion("major_describe is not null");
            return (Criteria) this;
        }

        public Criteria andMajorDescribeEqualTo(String value) {
            addCriterion("major_describe =", value, "majorDescribe");
            return (Criteria) this;
        }

        public Criteria andMajorDescribeNotEqualTo(String value) {
            addCriterion("major_describe <>", value, "majorDescribe");
            return (Criteria) this;
        }

        public Criteria andMajorDescribeGreaterThan(String value) {
            addCriterion("major_describe >", value, "majorDescribe");
            return (Criteria) this;
        }

        public Criteria andMajorDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("major_describe >=", value, "majorDescribe");
            return (Criteria) this;
        }

        public Criteria andMajorDescribeLessThan(String value) {
            addCriterion("major_describe <", value, "majorDescribe");
            return (Criteria) this;
        }

        public Criteria andMajorDescribeLessThanOrEqualTo(String value) {
            addCriterion("major_describe <=", value, "majorDescribe");
            return (Criteria) this;
        }

        public Criteria andMajorDescribeLike(String value) {
            addCriterion("major_describe like", value, "majorDescribe");
            return (Criteria) this;
        }

        public Criteria andMajorDescribeNotLike(String value) {
            addCriterion("major_describe not like", value, "majorDescribe");
            return (Criteria) this;
        }

        public Criteria andMajorDescribeIn(List<String> values) {
            addCriterion("major_describe in", values, "majorDescribe");
            return (Criteria) this;
        }

        public Criteria andMajorDescribeNotIn(List<String> values) {
            addCriterion("major_describe not in", values, "majorDescribe");
            return (Criteria) this;
        }

        public Criteria andMajorDescribeBetween(String value1, String value2) {
            addCriterion("major_describe between", value1, value2, "majorDescribe");
            return (Criteria) this;
        }

        public Criteria andMajorDescribeNotBetween(String value1, String value2) {
            addCriterion("major_describe not between", value1, value2, "majorDescribe");
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