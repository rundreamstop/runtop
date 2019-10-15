package com.deao.dal.daomain.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduMemberModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduMemberModelExample() {
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

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
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

        public Criteria andStuNameLetterIsNull() {
            addCriterion("stu_name_letter is null");
            return (Criteria) this;
        }

        public Criteria andStuNameLetterIsNotNull() {
            addCriterion("stu_name_letter is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameLetterEqualTo(String value) {
            addCriterion("stu_name_letter =", value, "stuNameLetter");
            return (Criteria) this;
        }

        public Criteria andStuNameLetterNotEqualTo(String value) {
            addCriterion("stu_name_letter <>", value, "stuNameLetter");
            return (Criteria) this;
        }

        public Criteria andStuNameLetterGreaterThan(String value) {
            addCriterion("stu_name_letter >", value, "stuNameLetter");
            return (Criteria) this;
        }

        public Criteria andStuNameLetterGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name_letter >=", value, "stuNameLetter");
            return (Criteria) this;
        }

        public Criteria andStuNameLetterLessThan(String value) {
            addCriterion("stu_name_letter <", value, "stuNameLetter");
            return (Criteria) this;
        }

        public Criteria andStuNameLetterLessThanOrEqualTo(String value) {
            addCriterion("stu_name_letter <=", value, "stuNameLetter");
            return (Criteria) this;
        }

        public Criteria andStuNameLetterLike(String value) {
            addCriterion("stu_name_letter like", value, "stuNameLetter");
            return (Criteria) this;
        }

        public Criteria andStuNameLetterNotLike(String value) {
            addCriterion("stu_name_letter not like", value, "stuNameLetter");
            return (Criteria) this;
        }

        public Criteria andStuNameLetterIn(List<String> values) {
            addCriterion("stu_name_letter in", values, "stuNameLetter");
            return (Criteria) this;
        }

        public Criteria andStuNameLetterNotIn(List<String> values) {
            addCriterion("stu_name_letter not in", values, "stuNameLetter");
            return (Criteria) this;
        }

        public Criteria andStuNameLetterBetween(String value1, String value2) {
            addCriterion("stu_name_letter between", value1, value2, "stuNameLetter");
            return (Criteria) this;
        }

        public Criteria andStuNameLetterNotBetween(String value1, String value2) {
            addCriterion("stu_name_letter not between", value1, value2, "stuNameLetter");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNull() {
            addCriterion("stu_phone is null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNotNull() {
            addCriterion("stu_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneEqualTo(String value) {
            addCriterion("stu_phone =", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotEqualTo(String value) {
            addCriterion("stu_phone <>", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThan(String value) {
            addCriterion("stu_phone >", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("stu_phone >=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThan(String value) {
            addCriterion("stu_phone <", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThanOrEqualTo(String value) {
            addCriterion("stu_phone <=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLike(String value) {
            addCriterion("stu_phone like", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotLike(String value) {
            addCriterion("stu_phone not like", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIn(List<String> values) {
            addCriterion("stu_phone in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotIn(List<String> values) {
            addCriterion("stu_phone not in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneBetween(String value1, String value2) {
            addCriterion("stu_phone between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotBetween(String value1, String value2) {
            addCriterion("stu_phone not between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(String value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(String value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(String value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(String value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(String value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(String value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLike(String value) {
            addCriterion("stu_id like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotLike(String value) {
            addCriterion("stu_id not like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<String> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<String> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(String value1, String value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(String value1, String value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeIsNull() {
            addCriterion("birthday_type is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeIsNotNull() {
            addCriterion("birthday_type is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeEqualTo(String value) {
            addCriterion("birthday_type =", value, "birthdayType");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeNotEqualTo(String value) {
            addCriterion("birthday_type <>", value, "birthdayType");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeGreaterThan(String value) {
            addCriterion("birthday_type >", value, "birthdayType");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("birthday_type >=", value, "birthdayType");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeLessThan(String value) {
            addCriterion("birthday_type <", value, "birthdayType");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeLessThanOrEqualTo(String value) {
            addCriterion("birthday_type <=", value, "birthdayType");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeLike(String value) {
            addCriterion("birthday_type like", value, "birthdayType");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeNotLike(String value) {
            addCriterion("birthday_type not like", value, "birthdayType");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeIn(List<String> values) {
            addCriterion("birthday_type in", values, "birthdayType");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeNotIn(List<String> values) {
            addCriterion("birthday_type not in", values, "birthdayType");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeBetween(String value1, String value2) {
            addCriterion("birthday_type between", value1, value2, "birthdayType");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeNotBetween(String value1, String value2) {
            addCriterion("birthday_type not between", value1, value2, "birthdayType");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeValuesIsNull() {
            addCriterion("birthday_type_values is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeValuesIsNotNull() {
            addCriterion("birthday_type_values is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeValuesEqualTo(String value) {
            addCriterion("birthday_type_values =", value, "birthdayTypeValues");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeValuesNotEqualTo(String value) {
            addCriterion("birthday_type_values <>", value, "birthdayTypeValues");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeValuesGreaterThan(String value) {
            addCriterion("birthday_type_values >", value, "birthdayTypeValues");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeValuesGreaterThanOrEqualTo(String value) {
            addCriterion("birthday_type_values >=", value, "birthdayTypeValues");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeValuesLessThan(String value) {
            addCriterion("birthday_type_values <", value, "birthdayTypeValues");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeValuesLessThanOrEqualTo(String value) {
            addCriterion("birthday_type_values <=", value, "birthdayTypeValues");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeValuesLike(String value) {
            addCriterion("birthday_type_values like", value, "birthdayTypeValues");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeValuesNotLike(String value) {
            addCriterion("birthday_type_values not like", value, "birthdayTypeValues");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeValuesIn(List<String> values) {
            addCriterion("birthday_type_values in", values, "birthdayTypeValues");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeValuesNotIn(List<String> values) {
            addCriterion("birthday_type_values not in", values, "birthdayTypeValues");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeValuesBetween(String value1, String value2) {
            addCriterion("birthday_type_values between", value1, value2, "birthdayTypeValues");
            return (Criteria) this;
        }

        public Criteria andBirthdayTypeValuesNotBetween(String value1, String value2) {
            addCriterion("birthday_type_values not between", value1, value2, "birthdayTypeValues");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayIsNull() {
            addCriterion("stu_birthday is null");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayIsNotNull() {
            addCriterion("stu_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayEqualTo(String value) {
            addCriterion("stu_birthday =", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayNotEqualTo(String value) {
            addCriterion("stu_birthday <>", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayGreaterThan(String value) {
            addCriterion("stu_birthday >", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("stu_birthday >=", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayLessThan(String value) {
            addCriterion("stu_birthday <", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayLessThanOrEqualTo(String value) {
            addCriterion("stu_birthday <=", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayLike(String value) {
            addCriterion("stu_birthday like", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayNotLike(String value) {
            addCriterion("stu_birthday not like", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayIn(List<String> values) {
            addCriterion("stu_birthday in", values, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayNotIn(List<String> values) {
            addCriterion("stu_birthday not in", values, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayBetween(String value1, String value2) {
            addCriterion("stu_birthday between", value1, value2, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayNotBetween(String value1, String value2) {
            addCriterion("stu_birthday not between", value1, value2, "stuBirthday");
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

        public Criteria andStuProfessionIsNull() {
            addCriterion("stu_profession is null");
            return (Criteria) this;
        }

        public Criteria andStuProfessionIsNotNull() {
            addCriterion("stu_profession is not null");
            return (Criteria) this;
        }

        public Criteria andStuProfessionEqualTo(String value) {
            addCriterion("stu_profession =", value, "stuProfession");
            return (Criteria) this;
        }

        public Criteria andStuProfessionNotEqualTo(String value) {
            addCriterion("stu_profession <>", value, "stuProfession");
            return (Criteria) this;
        }

        public Criteria andStuProfessionGreaterThan(String value) {
            addCriterion("stu_profession >", value, "stuProfession");
            return (Criteria) this;
        }

        public Criteria andStuProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("stu_profession >=", value, "stuProfession");
            return (Criteria) this;
        }

        public Criteria andStuProfessionLessThan(String value) {
            addCriterion("stu_profession <", value, "stuProfession");
            return (Criteria) this;
        }

        public Criteria andStuProfessionLessThanOrEqualTo(String value) {
            addCriterion("stu_profession <=", value, "stuProfession");
            return (Criteria) this;
        }

        public Criteria andStuProfessionLike(String value) {
            addCriterion("stu_profession like", value, "stuProfession");
            return (Criteria) this;
        }

        public Criteria andStuProfessionNotLike(String value) {
            addCriterion("stu_profession not like", value, "stuProfession");
            return (Criteria) this;
        }

        public Criteria andStuProfessionIn(List<String> values) {
            addCriterion("stu_profession in", values, "stuProfession");
            return (Criteria) this;
        }

        public Criteria andStuProfessionNotIn(List<String> values) {
            addCriterion("stu_profession not in", values, "stuProfession");
            return (Criteria) this;
        }

        public Criteria andStuProfessionBetween(String value1, String value2) {
            addCriterion("stu_profession between", value1, value2, "stuProfession");
            return (Criteria) this;
        }

        public Criteria andStuProfessionNotBetween(String value1, String value2) {
            addCriterion("stu_profession not between", value1, value2, "stuProfession");
            return (Criteria) this;
        }

        public Criteria andStuProfessionValuesIsNull() {
            addCriterion("stu_profession_values is null");
            return (Criteria) this;
        }

        public Criteria andStuProfessionValuesIsNotNull() {
            addCriterion("stu_profession_values is not null");
            return (Criteria) this;
        }

        public Criteria andStuProfessionValuesEqualTo(String value) {
            addCriterion("stu_profession_values =", value, "stuProfessionValues");
            return (Criteria) this;
        }

        public Criteria andStuProfessionValuesNotEqualTo(String value) {
            addCriterion("stu_profession_values <>", value, "stuProfessionValues");
            return (Criteria) this;
        }

        public Criteria andStuProfessionValuesGreaterThan(String value) {
            addCriterion("stu_profession_values >", value, "stuProfessionValues");
            return (Criteria) this;
        }

        public Criteria andStuProfessionValuesGreaterThanOrEqualTo(String value) {
            addCriterion("stu_profession_values >=", value, "stuProfessionValues");
            return (Criteria) this;
        }

        public Criteria andStuProfessionValuesLessThan(String value) {
            addCriterion("stu_profession_values <", value, "stuProfessionValues");
            return (Criteria) this;
        }

        public Criteria andStuProfessionValuesLessThanOrEqualTo(String value) {
            addCriterion("stu_profession_values <=", value, "stuProfessionValues");
            return (Criteria) this;
        }

        public Criteria andStuProfessionValuesLike(String value) {
            addCriterion("stu_profession_values like", value, "stuProfessionValues");
            return (Criteria) this;
        }

        public Criteria andStuProfessionValuesNotLike(String value) {
            addCriterion("stu_profession_values not like", value, "stuProfessionValues");
            return (Criteria) this;
        }

        public Criteria andStuProfessionValuesIn(List<String> values) {
            addCriterion("stu_profession_values in", values, "stuProfessionValues");
            return (Criteria) this;
        }

        public Criteria andStuProfessionValuesNotIn(List<String> values) {
            addCriterion("stu_profession_values not in", values, "stuProfessionValues");
            return (Criteria) this;
        }

        public Criteria andStuProfessionValuesBetween(String value1, String value2) {
            addCriterion("stu_profession_values between", value1, value2, "stuProfessionValues");
            return (Criteria) this;
        }

        public Criteria andStuProfessionValuesNotBetween(String value1, String value2) {
            addCriterion("stu_profession_values not between", value1, value2, "stuProfessionValues");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNull() {
            addCriterion("stu_class is null");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNotNull() {
            addCriterion("stu_class is not null");
            return (Criteria) this;
        }

        public Criteria andStuClassEqualTo(String value) {
            addCriterion("stu_class =", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotEqualTo(String value) {
            addCriterion("stu_class <>", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThan(String value) {
            addCriterion("stu_class >", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThanOrEqualTo(String value) {
            addCriterion("stu_class >=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThan(String value) {
            addCriterion("stu_class <", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThanOrEqualTo(String value) {
            addCriterion("stu_class <=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLike(String value) {
            addCriterion("stu_class like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotLike(String value) {
            addCriterion("stu_class not like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassIn(List<String> values) {
            addCriterion("stu_class in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotIn(List<String> values) {
            addCriterion("stu_class not in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassBetween(String value1, String value2) {
            addCriterion("stu_class between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotBetween(String value1, String value2) {
            addCriterion("stu_class not between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andUrgentNameIsNull() {
            addCriterion("urgent_name is null");
            return (Criteria) this;
        }

        public Criteria andUrgentNameIsNotNull() {
            addCriterion("urgent_name is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentNameEqualTo(String value) {
            addCriterion("urgent_name =", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameNotEqualTo(String value) {
            addCriterion("urgent_name <>", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameGreaterThan(String value) {
            addCriterion("urgent_name >", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("urgent_name >=", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameLessThan(String value) {
            addCriterion("urgent_name <", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameLessThanOrEqualTo(String value) {
            addCriterion("urgent_name <=", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameLike(String value) {
            addCriterion("urgent_name like", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameNotLike(String value) {
            addCriterion("urgent_name not like", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameIn(List<String> values) {
            addCriterion("urgent_name in", values, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameNotIn(List<String> values) {
            addCriterion("urgent_name not in", values, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameBetween(String value1, String value2) {
            addCriterion("urgent_name between", value1, value2, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameNotBetween(String value1, String value2) {
            addCriterion("urgent_name not between", value1, value2, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneIsNull() {
            addCriterion("urgent_phone is null");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneIsNotNull() {
            addCriterion("urgent_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneEqualTo(String value) {
            addCriterion("urgent_phone =", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneNotEqualTo(String value) {
            addCriterion("urgent_phone <>", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneGreaterThan(String value) {
            addCriterion("urgent_phone >", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("urgent_phone >=", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneLessThan(String value) {
            addCriterion("urgent_phone <", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneLessThanOrEqualTo(String value) {
            addCriterion("urgent_phone <=", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneLike(String value) {
            addCriterion("urgent_phone like", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneNotLike(String value) {
            addCriterion("urgent_phone not like", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneIn(List<String> values) {
            addCriterion("urgent_phone in", values, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneNotIn(List<String> values) {
            addCriterion("urgent_phone not in", values, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneBetween(String value1, String value2) {
            addCriterion("urgent_phone between", value1, value2, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneNotBetween(String value1, String value2) {
            addCriterion("urgent_phone not between", value1, value2, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andStuStatusIsNull() {
            addCriterion("stu_status is null");
            return (Criteria) this;
        }

        public Criteria andStuStatusIsNotNull() {
            addCriterion("stu_status is not null");
            return (Criteria) this;
        }

        public Criteria andStuStatusEqualTo(String value) {
            addCriterion("stu_status =", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotEqualTo(String value) {
            addCriterion("stu_status <>", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusGreaterThan(String value) {
            addCriterion("stu_status >", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusGreaterThanOrEqualTo(String value) {
            addCriterion("stu_status >=", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLessThan(String value) {
            addCriterion("stu_status <", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLessThanOrEqualTo(String value) {
            addCriterion("stu_status <=", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLike(String value) {
            addCriterion("stu_status like", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotLike(String value) {
            addCriterion("stu_status not like", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusIn(List<String> values) {
            addCriterion("stu_status in", values, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotIn(List<String> values) {
            addCriterion("stu_status not in", values, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusBetween(String value1, String value2) {
            addCriterion("stu_status between", value1, value2, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotBetween(String value1, String value2) {
            addCriterion("stu_status not between", value1, value2, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusValuesIsNull() {
            addCriterion("stu_status_values is null");
            return (Criteria) this;
        }

        public Criteria andStuStatusValuesIsNotNull() {
            addCriterion("stu_status_values is not null");
            return (Criteria) this;
        }

        public Criteria andStuStatusValuesEqualTo(String value) {
            addCriterion("stu_status_values =", value, "stuStatusValues");
            return (Criteria) this;
        }

        public Criteria andStuStatusValuesNotEqualTo(String value) {
            addCriterion("stu_status_values <>", value, "stuStatusValues");
            return (Criteria) this;
        }

        public Criteria andStuStatusValuesGreaterThan(String value) {
            addCriterion("stu_status_values >", value, "stuStatusValues");
            return (Criteria) this;
        }

        public Criteria andStuStatusValuesGreaterThanOrEqualTo(String value) {
            addCriterion("stu_status_values >=", value, "stuStatusValues");
            return (Criteria) this;
        }

        public Criteria andStuStatusValuesLessThan(String value) {
            addCriterion("stu_status_values <", value, "stuStatusValues");
            return (Criteria) this;
        }

        public Criteria andStuStatusValuesLessThanOrEqualTo(String value) {
            addCriterion("stu_status_values <=", value, "stuStatusValues");
            return (Criteria) this;
        }

        public Criteria andStuStatusValuesLike(String value) {
            addCriterion("stu_status_values like", value, "stuStatusValues");
            return (Criteria) this;
        }

        public Criteria andStuStatusValuesNotLike(String value) {
            addCriterion("stu_status_values not like", value, "stuStatusValues");
            return (Criteria) this;
        }

        public Criteria andStuStatusValuesIn(List<String> values) {
            addCriterion("stu_status_values in", values, "stuStatusValues");
            return (Criteria) this;
        }

        public Criteria andStuStatusValuesNotIn(List<String> values) {
            addCriterion("stu_status_values not in", values, "stuStatusValues");
            return (Criteria) this;
        }

        public Criteria andStuStatusValuesBetween(String value1, String value2) {
            addCriterion("stu_status_values between", value1, value2, "stuStatusValues");
            return (Criteria) this;
        }

        public Criteria andStuStatusValuesNotBetween(String value1, String value2) {
            addCriterion("stu_status_values not between", value1, value2, "stuStatusValues");
            return (Criteria) this;
        }

        public Criteria andMemberRoleIsNull() {
            addCriterion("member_role is null");
            return (Criteria) this;
        }

        public Criteria andMemberRoleIsNotNull() {
            addCriterion("member_role is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRoleEqualTo(String value) {
            addCriterion("member_role =", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleNotEqualTo(String value) {
            addCriterion("member_role <>", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleGreaterThan(String value) {
            addCriterion("member_role >", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleGreaterThanOrEqualTo(String value) {
            addCriterion("member_role >=", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleLessThan(String value) {
            addCriterion("member_role <", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleLessThanOrEqualTo(String value) {
            addCriterion("member_role <=", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleLike(String value) {
            addCriterion("member_role like", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleNotLike(String value) {
            addCriterion("member_role not like", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleIn(List<String> values) {
            addCriterion("member_role in", values, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleNotIn(List<String> values) {
            addCriterion("member_role not in", values, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleBetween(String value1, String value2) {
            addCriterion("member_role between", value1, value2, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleNotBetween(String value1, String value2) {
            addCriterion("member_role not between", value1, value2, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleValuesIsNull() {
            addCriterion("member_role_values is null");
            return (Criteria) this;
        }

        public Criteria andMemberRoleValuesIsNotNull() {
            addCriterion("member_role_values is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRoleValuesEqualTo(String value) {
            addCriterion("member_role_values =", value, "memberRoleValues");
            return (Criteria) this;
        }

        public Criteria andMemberRoleValuesNotEqualTo(String value) {
            addCriterion("member_role_values <>", value, "memberRoleValues");
            return (Criteria) this;
        }

        public Criteria andMemberRoleValuesGreaterThan(String value) {
            addCriterion("member_role_values >", value, "memberRoleValues");
            return (Criteria) this;
        }

        public Criteria andMemberRoleValuesGreaterThanOrEqualTo(String value) {
            addCriterion("member_role_values >=", value, "memberRoleValues");
            return (Criteria) this;
        }

        public Criteria andMemberRoleValuesLessThan(String value) {
            addCriterion("member_role_values <", value, "memberRoleValues");
            return (Criteria) this;
        }

        public Criteria andMemberRoleValuesLessThanOrEqualTo(String value) {
            addCriterion("member_role_values <=", value, "memberRoleValues");
            return (Criteria) this;
        }

        public Criteria andMemberRoleValuesLike(String value) {
            addCriterion("member_role_values like", value, "memberRoleValues");
            return (Criteria) this;
        }

        public Criteria andMemberRoleValuesNotLike(String value) {
            addCriterion("member_role_values not like", value, "memberRoleValues");
            return (Criteria) this;
        }

        public Criteria andMemberRoleValuesIn(List<String> values) {
            addCriterion("member_role_values in", values, "memberRoleValues");
            return (Criteria) this;
        }

        public Criteria andMemberRoleValuesNotIn(List<String> values) {
            addCriterion("member_role_values not in", values, "memberRoleValues");
            return (Criteria) this;
        }

        public Criteria andMemberRoleValuesBetween(String value1, String value2) {
            addCriterion("member_role_values between", value1, value2, "memberRoleValues");
            return (Criteria) this;
        }

        public Criteria andMemberRoleValuesNotBetween(String value1, String value2) {
            addCriterion("member_role_values not between", value1, value2, "memberRoleValues");
            return (Criteria) this;
        }

        public Criteria andLoginNumberIsNull() {
            addCriterion("login_number is null");
            return (Criteria) this;
        }

        public Criteria andLoginNumberIsNotNull() {
            addCriterion("login_number is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNumberEqualTo(Integer value) {
            addCriterion("login_number =", value, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberNotEqualTo(Integer value) {
            addCriterion("login_number <>", value, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberGreaterThan(Integer value) {
            addCriterion("login_number >", value, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_number >=", value, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberLessThan(Integer value) {
            addCriterion("login_number <", value, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberLessThanOrEqualTo(Integer value) {
            addCriterion("login_number <=", value, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberIn(List<Integer> values) {
            addCriterion("login_number in", values, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberNotIn(List<Integer> values) {
            addCriterion("login_number not in", values, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberBetween(Integer value1, Integer value2) {
            addCriterion("login_number between", value1, value2, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("login_number not between", value1, value2, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemIsNull() {
            addCriterion("school_system is null");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemIsNotNull() {
            addCriterion("school_system is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemEqualTo(String value) {
            addCriterion("school_system =", value, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemNotEqualTo(String value) {
            addCriterion("school_system <>", value, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemGreaterThan(String value) {
            addCriterion("school_system >", value, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemGreaterThanOrEqualTo(String value) {
            addCriterion("school_system >=", value, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemLessThan(String value) {
            addCriterion("school_system <", value, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemLessThanOrEqualTo(String value) {
            addCriterion("school_system <=", value, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemLike(String value) {
            addCriterion("school_system like", value, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemNotLike(String value) {
            addCriterion("school_system not like", value, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemIn(List<String> values) {
            addCriterion("school_system in", values, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemNotIn(List<String> values) {
            addCriterion("school_system not in", values, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemBetween(String value1, String value2) {
            addCriterion("school_system between", value1, value2, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemNotBetween(String value1, String value2) {
            addCriterion("school_system not between", value1, value2, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceIsNull() {
            addCriterion("politic_countenance is null");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceIsNotNull() {
            addCriterion("politic_countenance is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceEqualTo(String value) {
            addCriterion("politic_countenance =", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceNotEqualTo(String value) {
            addCriterion("politic_countenance <>", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceGreaterThan(String value) {
            addCriterion("politic_countenance >", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceGreaterThanOrEqualTo(String value) {
            addCriterion("politic_countenance >=", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceLessThan(String value) {
            addCriterion("politic_countenance <", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceLessThanOrEqualTo(String value) {
            addCriterion("politic_countenance <=", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceLike(String value) {
            addCriterion("politic_countenance like", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceNotLike(String value) {
            addCriterion("politic_countenance not like", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceIn(List<String> values) {
            addCriterion("politic_countenance in", values, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceNotIn(List<String> values) {
            addCriterion("politic_countenance not in", values, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceBetween(String value1, String value2) {
            addCriterion("politic_countenance between", value1, value2, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceNotBetween(String value1, String value2) {
            addCriterion("politic_countenance not between", value1, value2, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceValuesIsNull() {
            addCriterion("politic_countenance_values is null");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceValuesIsNotNull() {
            addCriterion("politic_countenance_values is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceValuesEqualTo(String value) {
            addCriterion("politic_countenance_values =", value, "politicCountenanceValues");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceValuesNotEqualTo(String value) {
            addCriterion("politic_countenance_values <>", value, "politicCountenanceValues");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceValuesGreaterThan(String value) {
            addCriterion("politic_countenance_values >", value, "politicCountenanceValues");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceValuesGreaterThanOrEqualTo(String value) {
            addCriterion("politic_countenance_values >=", value, "politicCountenanceValues");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceValuesLessThan(String value) {
            addCriterion("politic_countenance_values <", value, "politicCountenanceValues");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceValuesLessThanOrEqualTo(String value) {
            addCriterion("politic_countenance_values <=", value, "politicCountenanceValues");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceValuesLike(String value) {
            addCriterion("politic_countenance_values like", value, "politicCountenanceValues");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceValuesNotLike(String value) {
            addCriterion("politic_countenance_values not like", value, "politicCountenanceValues");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceValuesIn(List<String> values) {
            addCriterion("politic_countenance_values in", values, "politicCountenanceValues");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceValuesNotIn(List<String> values) {
            addCriterion("politic_countenance_values not in", values, "politicCountenanceValues");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceValuesBetween(String value1, String value2) {
            addCriterion("politic_countenance_values between", value1, value2, "politicCountenanceValues");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceValuesNotBetween(String value1, String value2) {
            addCriterion("politic_countenance_values not between", value1, value2, "politicCountenanceValues");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIsNull() {
            addCriterion("student_status is null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIsNotNull() {
            addCriterion("student_status is not null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusEqualTo(String value) {
            addCriterion("student_status =", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotEqualTo(String value) {
            addCriterion("student_status <>", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusGreaterThan(String value) {
            addCriterion("student_status >", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("student_status >=", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLessThan(String value) {
            addCriterion("student_status <", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLessThanOrEqualTo(String value) {
            addCriterion("student_status <=", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLike(String value) {
            addCriterion("student_status like", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotLike(String value) {
            addCriterion("student_status not like", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIn(List<String> values) {
            addCriterion("student_status in", values, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotIn(List<String> values) {
            addCriterion("student_status not in", values, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusBetween(String value1, String value2) {
            addCriterion("student_status between", value1, value2, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotBetween(String value1, String value2) {
            addCriterion("student_status not between", value1, value2, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusValuesIsNull() {
            addCriterion("student_status_values is null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusValuesIsNotNull() {
            addCriterion("student_status_values is not null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusValuesEqualTo(String value) {
            addCriterion("student_status_values =", value, "studentStatusValues");
            return (Criteria) this;
        }

        public Criteria andStudentStatusValuesNotEqualTo(String value) {
            addCriterion("student_status_values <>", value, "studentStatusValues");
            return (Criteria) this;
        }

        public Criteria andStudentStatusValuesGreaterThan(String value) {
            addCriterion("student_status_values >", value, "studentStatusValues");
            return (Criteria) this;
        }

        public Criteria andStudentStatusValuesGreaterThanOrEqualTo(String value) {
            addCriterion("student_status_values >=", value, "studentStatusValues");
            return (Criteria) this;
        }

        public Criteria andStudentStatusValuesLessThan(String value) {
            addCriterion("student_status_values <", value, "studentStatusValues");
            return (Criteria) this;
        }

        public Criteria andStudentStatusValuesLessThanOrEqualTo(String value) {
            addCriterion("student_status_values <=", value, "studentStatusValues");
            return (Criteria) this;
        }

        public Criteria andStudentStatusValuesLike(String value) {
            addCriterion("student_status_values like", value, "studentStatusValues");
            return (Criteria) this;
        }

        public Criteria andStudentStatusValuesNotLike(String value) {
            addCriterion("student_status_values not like", value, "studentStatusValues");
            return (Criteria) this;
        }

        public Criteria andStudentStatusValuesIn(List<String> values) {
            addCriterion("student_status_values in", values, "studentStatusValues");
            return (Criteria) this;
        }

        public Criteria andStudentStatusValuesNotIn(List<String> values) {
            addCriterion("student_status_values not in", values, "studentStatusValues");
            return (Criteria) this;
        }

        public Criteria andStudentStatusValuesBetween(String value1, String value2) {
            addCriterion("student_status_values between", value1, value2, "studentStatusValues");
            return (Criteria) this;
        }

        public Criteria andStudentStatusValuesNotBetween(String value1, String value2) {
            addCriterion("student_status_values not between", value1, value2, "studentStatusValues");
            return (Criteria) this;
        }

        public Criteria andStuPhotoUrlIsNull() {
            addCriterion("stu_photo_url is null");
            return (Criteria) this;
        }

        public Criteria andStuPhotoUrlIsNotNull() {
            addCriterion("stu_photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andStuPhotoUrlEqualTo(String value) {
            addCriterion("stu_photo_url =", value, "stuPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andStuPhotoUrlNotEqualTo(String value) {
            addCriterion("stu_photo_url <>", value, "stuPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andStuPhotoUrlGreaterThan(String value) {
            addCriterion("stu_photo_url >", value, "stuPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andStuPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("stu_photo_url >=", value, "stuPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andStuPhotoUrlLessThan(String value) {
            addCriterion("stu_photo_url <", value, "stuPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andStuPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("stu_photo_url <=", value, "stuPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andStuPhotoUrlLike(String value) {
            addCriterion("stu_photo_url like", value, "stuPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andStuPhotoUrlNotLike(String value) {
            addCriterion("stu_photo_url not like", value, "stuPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andStuPhotoUrlIn(List<String> values) {
            addCriterion("stu_photo_url in", values, "stuPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andStuPhotoUrlNotIn(List<String> values) {
            addCriterion("stu_photo_url not in", values, "stuPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andStuPhotoUrlBetween(String value1, String value2) {
            addCriterion("stu_photo_url between", value1, value2, "stuPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andStuPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("stu_photo_url not between", value1, value2, "stuPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andStuGradeIsNull() {
            addCriterion("stu_grade is null");
            return (Criteria) this;
        }

        public Criteria andStuGradeIsNotNull() {
            addCriterion("stu_grade is not null");
            return (Criteria) this;
        }

        public Criteria andStuGradeEqualTo(String value) {
            addCriterion("stu_grade =", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotEqualTo(String value) {
            addCriterion("stu_grade <>", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeGreaterThan(String value) {
            addCriterion("stu_grade >", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeGreaterThanOrEqualTo(String value) {
            addCriterion("stu_grade >=", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLessThan(String value) {
            addCriterion("stu_grade <", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLessThanOrEqualTo(String value) {
            addCriterion("stu_grade <=", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLike(String value) {
            addCriterion("stu_grade like", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotLike(String value) {
            addCriterion("stu_grade not like", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeIn(List<String> values) {
            addCriterion("stu_grade in", values, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotIn(List<String> values) {
            addCriterion("stu_grade not in", values, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeBetween(String value1, String value2) {
            addCriterion("stu_grade between", value1, value2, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotBetween(String value1, String value2) {
            addCriterion("stu_grade not between", value1, value2, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeValuesIsNull() {
            addCriterion("stu_grade_values is null");
            return (Criteria) this;
        }

        public Criteria andStuGradeValuesIsNotNull() {
            addCriterion("stu_grade_values is not null");
            return (Criteria) this;
        }

        public Criteria andStuGradeValuesEqualTo(String value) {
            addCriterion("stu_grade_values =", value, "stuGradeValues");
            return (Criteria) this;
        }

        public Criteria andStuGradeValuesNotEqualTo(String value) {
            addCriterion("stu_grade_values <>", value, "stuGradeValues");
            return (Criteria) this;
        }

        public Criteria andStuGradeValuesGreaterThan(String value) {
            addCriterion("stu_grade_values >", value, "stuGradeValues");
            return (Criteria) this;
        }

        public Criteria andStuGradeValuesGreaterThanOrEqualTo(String value) {
            addCriterion("stu_grade_values >=", value, "stuGradeValues");
            return (Criteria) this;
        }

        public Criteria andStuGradeValuesLessThan(String value) {
            addCriterion("stu_grade_values <", value, "stuGradeValues");
            return (Criteria) this;
        }

        public Criteria andStuGradeValuesLessThanOrEqualTo(String value) {
            addCriterion("stu_grade_values <=", value, "stuGradeValues");
            return (Criteria) this;
        }

        public Criteria andStuGradeValuesLike(String value) {
            addCriterion("stu_grade_values like", value, "stuGradeValues");
            return (Criteria) this;
        }

        public Criteria andStuGradeValuesNotLike(String value) {
            addCriterion("stu_grade_values not like", value, "stuGradeValues");
            return (Criteria) this;
        }

        public Criteria andStuGradeValuesIn(List<String> values) {
            addCriterion("stu_grade_values in", values, "stuGradeValues");
            return (Criteria) this;
        }

        public Criteria andStuGradeValuesNotIn(List<String> values) {
            addCriterion("stu_grade_values not in", values, "stuGradeValues");
            return (Criteria) this;
        }

        public Criteria andStuGradeValuesBetween(String value1, String value2) {
            addCriterion("stu_grade_values between", value1, value2, "stuGradeValues");
            return (Criteria) this;
        }

        public Criteria andStuGradeValuesNotBetween(String value1, String value2) {
            addCriterion("stu_grade_values not between", value1, value2, "stuGradeValues");
            return (Criteria) this;
        }

        public Criteria andMailBoxIsNull() {
            addCriterion("mail_box is null");
            return (Criteria) this;
        }

        public Criteria andMailBoxIsNotNull() {
            addCriterion("mail_box is not null");
            return (Criteria) this;
        }

        public Criteria andMailBoxEqualTo(String value) {
            addCriterion("mail_box =", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxNotEqualTo(String value) {
            addCriterion("mail_box <>", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxGreaterThan(String value) {
            addCriterion("mail_box >", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxGreaterThanOrEqualTo(String value) {
            addCriterion("mail_box >=", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxLessThan(String value) {
            addCriterion("mail_box <", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxLessThanOrEqualTo(String value) {
            addCriterion("mail_box <=", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxLike(String value) {
            addCriterion("mail_box like", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxNotLike(String value) {
            addCriterion("mail_box not like", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxIn(List<String> values) {
            addCriterion("mail_box in", values, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxNotIn(List<String> values) {
            addCriterion("mail_box not in", values, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxBetween(String value1, String value2) {
            addCriterion("mail_box between", value1, value2, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxNotBetween(String value1, String value2) {
            addCriterion("mail_box not between", value1, value2, "mailBox");
            return (Criteria) this;
        }

        public Criteria andWechatNumberIsNull() {
            addCriterion("wechat_number is null");
            return (Criteria) this;
        }

        public Criteria andWechatNumberIsNotNull() {
            addCriterion("wechat_number is not null");
            return (Criteria) this;
        }

        public Criteria andWechatNumberEqualTo(String value) {
            addCriterion("wechat_number =", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberNotEqualTo(String value) {
            addCriterion("wechat_number <>", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberGreaterThan(String value) {
            addCriterion("wechat_number >", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_number >=", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberLessThan(String value) {
            addCriterion("wechat_number <", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberLessThanOrEqualTo(String value) {
            addCriterion("wechat_number <=", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberLike(String value) {
            addCriterion("wechat_number like", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberNotLike(String value) {
            addCriterion("wechat_number not like", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberIn(List<String> values) {
            addCriterion("wechat_number in", values, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberNotIn(List<String> values) {
            addCriterion("wechat_number not in", values, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberBetween(String value1, String value2) {
            addCriterion("wechat_number between", value1, value2, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberNotBetween(String value1, String value2) {
            addCriterion("wechat_number not between", value1, value2, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressIsNull() {
            addCriterion("family_address is null");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressIsNotNull() {
            addCriterion("family_address is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressEqualTo(String value) {
            addCriterion("family_address =", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressNotEqualTo(String value) {
            addCriterion("family_address <>", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressGreaterThan(String value) {
            addCriterion("family_address >", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("family_address >=", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressLessThan(String value) {
            addCriterion("family_address <", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressLessThanOrEqualTo(String value) {
            addCriterion("family_address <=", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressLike(String value) {
            addCriterion("family_address like", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressNotLike(String value) {
            addCriterion("family_address not like", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressIn(List<String> values) {
            addCriterion("family_address in", values, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressNotIn(List<String> values) {
            addCriterion("family_address not in", values, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressBetween(String value1, String value2) {
            addCriterion("family_address between", value1, value2, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressNotBetween(String value1, String value2) {
            addCriterion("family_address not between", value1, value2, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andInformationStatusIsNull() {
            addCriterion("information_status is null");
            return (Criteria) this;
        }

        public Criteria andInformationStatusIsNotNull() {
            addCriterion("information_status is not null");
            return (Criteria) this;
        }

        public Criteria andInformationStatusEqualTo(String value) {
            addCriterion("information_status =", value, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusNotEqualTo(String value) {
            addCriterion("information_status <>", value, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusGreaterThan(String value) {
            addCriterion("information_status >", value, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusGreaterThanOrEqualTo(String value) {
            addCriterion("information_status >=", value, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusLessThan(String value) {
            addCriterion("information_status <", value, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusLessThanOrEqualTo(String value) {
            addCriterion("information_status <=", value, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusLike(String value) {
            addCriterion("information_status like", value, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusNotLike(String value) {
            addCriterion("information_status not like", value, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusIn(List<String> values) {
            addCriterion("information_status in", values, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusNotIn(List<String> values) {
            addCriterion("information_status not in", values, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusBetween(String value1, String value2) {
            addCriterion("information_status between", value1, value2, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusNotBetween(String value1, String value2) {
            addCriterion("information_status not between", value1, value2, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusValuesIsNull() {
            addCriterion("information_status_values is null");
            return (Criteria) this;
        }

        public Criteria andInformationStatusValuesIsNotNull() {
            addCriterion("information_status_values is not null");
            return (Criteria) this;
        }

        public Criteria andInformationStatusValuesEqualTo(String value) {
            addCriterion("information_status_values =", value, "informationStatusValues");
            return (Criteria) this;
        }

        public Criteria andInformationStatusValuesNotEqualTo(String value) {
            addCriterion("information_status_values <>", value, "informationStatusValues");
            return (Criteria) this;
        }

        public Criteria andInformationStatusValuesGreaterThan(String value) {
            addCriterion("information_status_values >", value, "informationStatusValues");
            return (Criteria) this;
        }

        public Criteria andInformationStatusValuesGreaterThanOrEqualTo(String value) {
            addCriterion("information_status_values >=", value, "informationStatusValues");
            return (Criteria) this;
        }

        public Criteria andInformationStatusValuesLessThan(String value) {
            addCriterion("information_status_values <", value, "informationStatusValues");
            return (Criteria) this;
        }

        public Criteria andInformationStatusValuesLessThanOrEqualTo(String value) {
            addCriterion("information_status_values <=", value, "informationStatusValues");
            return (Criteria) this;
        }

        public Criteria andInformationStatusValuesLike(String value) {
            addCriterion("information_status_values like", value, "informationStatusValues");
            return (Criteria) this;
        }

        public Criteria andInformationStatusValuesNotLike(String value) {
            addCriterion("information_status_values not like", value, "informationStatusValues");
            return (Criteria) this;
        }

        public Criteria andInformationStatusValuesIn(List<String> values) {
            addCriterion("information_status_values in", values, "informationStatusValues");
            return (Criteria) this;
        }

        public Criteria andInformationStatusValuesNotIn(List<String> values) {
            addCriterion("information_status_values not in", values, "informationStatusValues");
            return (Criteria) this;
        }

        public Criteria andInformationStatusValuesBetween(String value1, String value2) {
            addCriterion("information_status_values between", value1, value2, "informationStatusValues");
            return (Criteria) this;
        }

        public Criteria andInformationStatusValuesNotBetween(String value1, String value2) {
            addCriterion("information_status_values not between", value1, value2, "informationStatusValues");
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