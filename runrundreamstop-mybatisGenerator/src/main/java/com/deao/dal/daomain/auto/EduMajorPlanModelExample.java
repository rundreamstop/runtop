package com.deao.dal.daomain.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduMajorPlanModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduMajorPlanModelExample() {
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

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
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

        public Criteria andMajorIdEqualTo(String value) {
            addCriterion("major_id =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(String value) {
            addCriterion("major_id <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(String value) {
            addCriterion("major_id >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(String value) {
            addCriterion("major_id >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(String value) {
            addCriterion("major_id <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(String value) {
            addCriterion("major_id <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLike(String value) {
            addCriterion("major_id like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotLike(String value) {
            addCriterion("major_id not like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<String> values) {
            addCriterion("major_id in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<String> values) {
            addCriterion("major_id not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(String value1, String value2) {
            addCriterion("major_id between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(String value1, String value2) {
            addCriterion("major_id not between", value1, value2, "majorId");
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

        public Criteria andTeachingModuleIsNull() {
            addCriterion("teaching_module is null");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleIsNotNull() {
            addCriterion("teaching_module is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleEqualTo(String value) {
            addCriterion("teaching_module =", value, "teachingModule");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleNotEqualTo(String value) {
            addCriterion("teaching_module <>", value, "teachingModule");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleGreaterThan(String value) {
            addCriterion("teaching_module >", value, "teachingModule");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_module >=", value, "teachingModule");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleLessThan(String value) {
            addCriterion("teaching_module <", value, "teachingModule");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleLessThanOrEqualTo(String value) {
            addCriterion("teaching_module <=", value, "teachingModule");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleLike(String value) {
            addCriterion("teaching_module like", value, "teachingModule");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleNotLike(String value) {
            addCriterion("teaching_module not like", value, "teachingModule");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleIn(List<String> values) {
            addCriterion("teaching_module in", values, "teachingModule");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleNotIn(List<String> values) {
            addCriterion("teaching_module not in", values, "teachingModule");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleBetween(String value1, String value2) {
            addCriterion("teaching_module between", value1, value2, "teachingModule");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleNotBetween(String value1, String value2) {
            addCriterion("teaching_module not between", value1, value2, "teachingModule");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleValuesIsNull() {
            addCriterion("teaching_module_values is null");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleValuesIsNotNull() {
            addCriterion("teaching_module_values is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleValuesEqualTo(String value) {
            addCriterion("teaching_module_values =", value, "teachingModuleValues");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleValuesNotEqualTo(String value) {
            addCriterion("teaching_module_values <>", value, "teachingModuleValues");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleValuesGreaterThan(String value) {
            addCriterion("teaching_module_values >", value, "teachingModuleValues");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleValuesGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_module_values >=", value, "teachingModuleValues");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleValuesLessThan(String value) {
            addCriterion("teaching_module_values <", value, "teachingModuleValues");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleValuesLessThanOrEqualTo(String value) {
            addCriterion("teaching_module_values <=", value, "teachingModuleValues");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleValuesLike(String value) {
            addCriterion("teaching_module_values like", value, "teachingModuleValues");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleValuesNotLike(String value) {
            addCriterion("teaching_module_values not like", value, "teachingModuleValues");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleValuesIn(List<String> values) {
            addCriterion("teaching_module_values in", values, "teachingModuleValues");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleValuesNotIn(List<String> values) {
            addCriterion("teaching_module_values not in", values, "teachingModuleValues");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleValuesBetween(String value1, String value2) {
            addCriterion("teaching_module_values between", value1, value2, "teachingModuleValues");
            return (Criteria) this;
        }

        public Criteria andTeachingModuleValuesNotBetween(String value1, String value2) {
            addCriterion("teaching_module_values not between", value1, value2, "teachingModuleValues");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumIsNull() {
            addCriterion("nature_curriculum is null");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumIsNotNull() {
            addCriterion("nature_curriculum is not null");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumEqualTo(String value) {
            addCriterion("nature_curriculum =", value, "natureCurriculum");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumNotEqualTo(String value) {
            addCriterion("nature_curriculum <>", value, "natureCurriculum");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumGreaterThan(String value) {
            addCriterion("nature_curriculum >", value, "natureCurriculum");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumGreaterThanOrEqualTo(String value) {
            addCriterion("nature_curriculum >=", value, "natureCurriculum");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumLessThan(String value) {
            addCriterion("nature_curriculum <", value, "natureCurriculum");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumLessThanOrEqualTo(String value) {
            addCriterion("nature_curriculum <=", value, "natureCurriculum");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumLike(String value) {
            addCriterion("nature_curriculum like", value, "natureCurriculum");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumNotLike(String value) {
            addCriterion("nature_curriculum not like", value, "natureCurriculum");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumIn(List<String> values) {
            addCriterion("nature_curriculum in", values, "natureCurriculum");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumNotIn(List<String> values) {
            addCriterion("nature_curriculum not in", values, "natureCurriculum");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumBetween(String value1, String value2) {
            addCriterion("nature_curriculum between", value1, value2, "natureCurriculum");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumNotBetween(String value1, String value2) {
            addCriterion("nature_curriculum not between", value1, value2, "natureCurriculum");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumValuesIsNull() {
            addCriterion("nature_curriculum_values is null");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumValuesIsNotNull() {
            addCriterion("nature_curriculum_values is not null");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumValuesEqualTo(String value) {
            addCriterion("nature_curriculum_values =", value, "natureCurriculumValues");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumValuesNotEqualTo(String value) {
            addCriterion("nature_curriculum_values <>", value, "natureCurriculumValues");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumValuesGreaterThan(String value) {
            addCriterion("nature_curriculum_values >", value, "natureCurriculumValues");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumValuesGreaterThanOrEqualTo(String value) {
            addCriterion("nature_curriculum_values >=", value, "natureCurriculumValues");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumValuesLessThan(String value) {
            addCriterion("nature_curriculum_values <", value, "natureCurriculumValues");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumValuesLessThanOrEqualTo(String value) {
            addCriterion("nature_curriculum_values <=", value, "natureCurriculumValues");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumValuesLike(String value) {
            addCriterion("nature_curriculum_values like", value, "natureCurriculumValues");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumValuesNotLike(String value) {
            addCriterion("nature_curriculum_values not like", value, "natureCurriculumValues");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumValuesIn(List<String> values) {
            addCriterion("nature_curriculum_values in", values, "natureCurriculumValues");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumValuesNotIn(List<String> values) {
            addCriterion("nature_curriculum_values not in", values, "natureCurriculumValues");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumValuesBetween(String value1, String value2) {
            addCriterion("nature_curriculum_values between", value1, value2, "natureCurriculumValues");
            return (Criteria) this;
        }

        public Criteria andNatureCurriculumValuesNotBetween(String value1, String value2) {
            addCriterion("nature_curriculum_values not between", value1, value2, "natureCurriculumValues");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesIsNull() {
            addCriterion("course_categories is null");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesIsNotNull() {
            addCriterion("course_categories is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesEqualTo(String value) {
            addCriterion("course_categories =", value, "courseCategories");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesNotEqualTo(String value) {
            addCriterion("course_categories <>", value, "courseCategories");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesGreaterThan(String value) {
            addCriterion("course_categories >", value, "courseCategories");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesGreaterThanOrEqualTo(String value) {
            addCriterion("course_categories >=", value, "courseCategories");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesLessThan(String value) {
            addCriterion("course_categories <", value, "courseCategories");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesLessThanOrEqualTo(String value) {
            addCriterion("course_categories <=", value, "courseCategories");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesLike(String value) {
            addCriterion("course_categories like", value, "courseCategories");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesNotLike(String value) {
            addCriterion("course_categories not like", value, "courseCategories");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesIn(List<String> values) {
            addCriterion("course_categories in", values, "courseCategories");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesNotIn(List<String> values) {
            addCriterion("course_categories not in", values, "courseCategories");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesBetween(String value1, String value2) {
            addCriterion("course_categories between", value1, value2, "courseCategories");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesNotBetween(String value1, String value2) {
            addCriterion("course_categories not between", value1, value2, "courseCategories");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesValuesIsNull() {
            addCriterion("course_categories_values is null");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesValuesIsNotNull() {
            addCriterion("course_categories_values is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesValuesEqualTo(String value) {
            addCriterion("course_categories_values =", value, "courseCategoriesValues");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesValuesNotEqualTo(String value) {
            addCriterion("course_categories_values <>", value, "courseCategoriesValues");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesValuesGreaterThan(String value) {
            addCriterion("course_categories_values >", value, "courseCategoriesValues");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesValuesGreaterThanOrEqualTo(String value) {
            addCriterion("course_categories_values >=", value, "courseCategoriesValues");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesValuesLessThan(String value) {
            addCriterion("course_categories_values <", value, "courseCategoriesValues");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesValuesLessThanOrEqualTo(String value) {
            addCriterion("course_categories_values <=", value, "courseCategoriesValues");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesValuesLike(String value) {
            addCriterion("course_categories_values like", value, "courseCategoriesValues");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesValuesNotLike(String value) {
            addCriterion("course_categories_values not like", value, "courseCategoriesValues");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesValuesIn(List<String> values) {
            addCriterion("course_categories_values in", values, "courseCategoriesValues");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesValuesNotIn(List<String> values) {
            addCriterion("course_categories_values not in", values, "courseCategoriesValues");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesValuesBetween(String value1, String value2) {
            addCriterion("course_categories_values between", value1, value2, "courseCategoriesValues");
            return (Criteria) this;
        }

        public Criteria andCourseCategoriesValuesNotBetween(String value1, String value2) {
            addCriterion("course_categories_values not between", value1, value2, "courseCategoriesValues");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsIsNull() {
            addCriterion("examination_methods is null");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsIsNotNull() {
            addCriterion("examination_methods is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsEqualTo(String value) {
            addCriterion("examination_methods =", value, "examinationMethods");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsNotEqualTo(String value) {
            addCriterion("examination_methods <>", value, "examinationMethods");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsGreaterThan(String value) {
            addCriterion("examination_methods >", value, "examinationMethods");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsGreaterThanOrEqualTo(String value) {
            addCriterion("examination_methods >=", value, "examinationMethods");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsLessThan(String value) {
            addCriterion("examination_methods <", value, "examinationMethods");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsLessThanOrEqualTo(String value) {
            addCriterion("examination_methods <=", value, "examinationMethods");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsLike(String value) {
            addCriterion("examination_methods like", value, "examinationMethods");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsNotLike(String value) {
            addCriterion("examination_methods not like", value, "examinationMethods");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsIn(List<String> values) {
            addCriterion("examination_methods in", values, "examinationMethods");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsNotIn(List<String> values) {
            addCriterion("examination_methods not in", values, "examinationMethods");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsBetween(String value1, String value2) {
            addCriterion("examination_methods between", value1, value2, "examinationMethods");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsNotBetween(String value1, String value2) {
            addCriterion("examination_methods not between", value1, value2, "examinationMethods");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsValuesIsNull() {
            addCriterion("examination_methods_values is null");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsValuesIsNotNull() {
            addCriterion("examination_methods_values is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsValuesEqualTo(String value) {
            addCriterion("examination_methods_values =", value, "examinationMethodsValues");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsValuesNotEqualTo(String value) {
            addCriterion("examination_methods_values <>", value, "examinationMethodsValues");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsValuesGreaterThan(String value) {
            addCriterion("examination_methods_values >", value, "examinationMethodsValues");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsValuesGreaterThanOrEqualTo(String value) {
            addCriterion("examination_methods_values >=", value, "examinationMethodsValues");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsValuesLessThan(String value) {
            addCriterion("examination_methods_values <", value, "examinationMethodsValues");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsValuesLessThanOrEqualTo(String value) {
            addCriterion("examination_methods_values <=", value, "examinationMethodsValues");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsValuesLike(String value) {
            addCriterion("examination_methods_values like", value, "examinationMethodsValues");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsValuesNotLike(String value) {
            addCriterion("examination_methods_values not like", value, "examinationMethodsValues");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsValuesIn(List<String> values) {
            addCriterion("examination_methods_values in", values, "examinationMethodsValues");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsValuesNotIn(List<String> values) {
            addCriterion("examination_methods_values not in", values, "examinationMethodsValues");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsValuesBetween(String value1, String value2) {
            addCriterion("examination_methods_values between", value1, value2, "examinationMethodsValues");
            return (Criteria) this;
        }

        public Criteria andExaminationMethodsValuesNotBetween(String value1, String value2) {
            addCriterion("examination_methods_values not between", value1, value2, "examinationMethodsValues");
            return (Criteria) this;
        }

        public Criteria andCourseCodeIsNull() {
            addCriterion("course_code is null");
            return (Criteria) this;
        }

        public Criteria andCourseCodeIsNotNull() {
            addCriterion("course_code is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCodeEqualTo(String value) {
            addCriterion("course_code =", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotEqualTo(String value) {
            addCriterion("course_code <>", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeGreaterThan(String value) {
            addCriterion("course_code >", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("course_code >=", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeLessThan(String value) {
            addCriterion("course_code <", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeLessThanOrEqualTo(String value) {
            addCriterion("course_code <=", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeLike(String value) {
            addCriterion("course_code like", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotLike(String value) {
            addCriterion("course_code not like", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeIn(List<String> values) {
            addCriterion("course_code in", values, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotIn(List<String> values) {
            addCriterion("course_code not in", values, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeBetween(String value1, String value2) {
            addCriterion("course_code between", value1, value2, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotBetween(String value1, String value2) {
            addCriterion("course_code not between", value1, value2, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andAchieveCreditsIsNull() {
            addCriterion("achieve_credits is null");
            return (Criteria) this;
        }

        public Criteria andAchieveCreditsIsNotNull() {
            addCriterion("achieve_credits is not null");
            return (Criteria) this;
        }

        public Criteria andAchieveCreditsEqualTo(String value) {
            addCriterion("achieve_credits =", value, "achieveCredits");
            return (Criteria) this;
        }

        public Criteria andAchieveCreditsNotEqualTo(String value) {
            addCriterion("achieve_credits <>", value, "achieveCredits");
            return (Criteria) this;
        }

        public Criteria andAchieveCreditsGreaterThan(String value) {
            addCriterion("achieve_credits >", value, "achieveCredits");
            return (Criteria) this;
        }

        public Criteria andAchieveCreditsGreaterThanOrEqualTo(String value) {
            addCriterion("achieve_credits >=", value, "achieveCredits");
            return (Criteria) this;
        }

        public Criteria andAchieveCreditsLessThan(String value) {
            addCriterion("achieve_credits <", value, "achieveCredits");
            return (Criteria) this;
        }

        public Criteria andAchieveCreditsLessThanOrEqualTo(String value) {
            addCriterion("achieve_credits <=", value, "achieveCredits");
            return (Criteria) this;
        }

        public Criteria andAchieveCreditsLike(String value) {
            addCriterion("achieve_credits like", value, "achieveCredits");
            return (Criteria) this;
        }

        public Criteria andAchieveCreditsNotLike(String value) {
            addCriterion("achieve_credits not like", value, "achieveCredits");
            return (Criteria) this;
        }

        public Criteria andAchieveCreditsIn(List<String> values) {
            addCriterion("achieve_credits in", values, "achieveCredits");
            return (Criteria) this;
        }

        public Criteria andAchieveCreditsNotIn(List<String> values) {
            addCriterion("achieve_credits not in", values, "achieveCredits");
            return (Criteria) this;
        }

        public Criteria andAchieveCreditsBetween(String value1, String value2) {
            addCriterion("achieve_credits between", value1, value2, "achieveCredits");
            return (Criteria) this;
        }

        public Criteria andAchieveCreditsNotBetween(String value1, String value2) {
            addCriterion("achieve_credits not between", value1, value2, "achieveCredits");
            return (Criteria) this;
        }

        public Criteria andTotalHoursIsNull() {
            addCriterion("total_hours is null");
            return (Criteria) this;
        }

        public Criteria andTotalHoursIsNotNull() {
            addCriterion("total_hours is not null");
            return (Criteria) this;
        }

        public Criteria andTotalHoursEqualTo(String value) {
            addCriterion("total_hours =", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursNotEqualTo(String value) {
            addCriterion("total_hours <>", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursGreaterThan(String value) {
            addCriterion("total_hours >", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursGreaterThanOrEqualTo(String value) {
            addCriterion("total_hours >=", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursLessThan(String value) {
            addCriterion("total_hours <", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursLessThanOrEqualTo(String value) {
            addCriterion("total_hours <=", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursLike(String value) {
            addCriterion("total_hours like", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursNotLike(String value) {
            addCriterion("total_hours not like", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursIn(List<String> values) {
            addCriterion("total_hours in", values, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursNotIn(List<String> values) {
            addCriterion("total_hours not in", values, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursBetween(String value1, String value2) {
            addCriterion("total_hours between", value1, value2, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursNotBetween(String value1, String value2) {
            addCriterion("total_hours not between", value1, value2, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursIsNull() {
            addCriterion("teaching_hours is null");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursIsNotNull() {
            addCriterion("teaching_hours is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursEqualTo(String value) {
            addCriterion("teaching_hours =", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursNotEqualTo(String value) {
            addCriterion("teaching_hours <>", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursGreaterThan(String value) {
            addCriterion("teaching_hours >", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_hours >=", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursLessThan(String value) {
            addCriterion("teaching_hours <", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursLessThanOrEqualTo(String value) {
            addCriterion("teaching_hours <=", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursLike(String value) {
            addCriterion("teaching_hours like", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursNotLike(String value) {
            addCriterion("teaching_hours not like", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursIn(List<String> values) {
            addCriterion("teaching_hours in", values, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursNotIn(List<String> values) {
            addCriterion("teaching_hours not in", values, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursBetween(String value1, String value2) {
            addCriterion("teaching_hours between", value1, value2, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursNotBetween(String value1, String value2) {
            addCriterion("teaching_hours not between", value1, value2, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andPracticalHoursIsNull() {
            addCriterion("practical_hours is null");
            return (Criteria) this;
        }

        public Criteria andPracticalHoursIsNotNull() {
            addCriterion("practical_hours is not null");
            return (Criteria) this;
        }

        public Criteria andPracticalHoursEqualTo(String value) {
            addCriterion("practical_hours =", value, "practicalHours");
            return (Criteria) this;
        }

        public Criteria andPracticalHoursNotEqualTo(String value) {
            addCriterion("practical_hours <>", value, "practicalHours");
            return (Criteria) this;
        }

        public Criteria andPracticalHoursGreaterThan(String value) {
            addCriterion("practical_hours >", value, "practicalHours");
            return (Criteria) this;
        }

        public Criteria andPracticalHoursGreaterThanOrEqualTo(String value) {
            addCriterion("practical_hours >=", value, "practicalHours");
            return (Criteria) this;
        }

        public Criteria andPracticalHoursLessThan(String value) {
            addCriterion("practical_hours <", value, "practicalHours");
            return (Criteria) this;
        }

        public Criteria andPracticalHoursLessThanOrEqualTo(String value) {
            addCriterion("practical_hours <=", value, "practicalHours");
            return (Criteria) this;
        }

        public Criteria andPracticalHoursLike(String value) {
            addCriterion("practical_hours like", value, "practicalHours");
            return (Criteria) this;
        }

        public Criteria andPracticalHoursNotLike(String value) {
            addCriterion("practical_hours not like", value, "practicalHours");
            return (Criteria) this;
        }

        public Criteria andPracticalHoursIn(List<String> values) {
            addCriterion("practical_hours in", values, "practicalHours");
            return (Criteria) this;
        }

        public Criteria andPracticalHoursNotIn(List<String> values) {
            addCriterion("practical_hours not in", values, "practicalHours");
            return (Criteria) this;
        }

        public Criteria andPracticalHoursBetween(String value1, String value2) {
            addCriterion("practical_hours between", value1, value2, "practicalHours");
            return (Criteria) this;
        }

        public Criteria andPracticalHoursNotBetween(String value1, String value2) {
            addCriterion("practical_hours not between", value1, value2, "practicalHours");
            return (Criteria) this;
        }

        public Criteria andSemester1IsNull() {
            addCriterion("semester1 is null");
            return (Criteria) this;
        }

        public Criteria andSemester1IsNotNull() {
            addCriterion("semester1 is not null");
            return (Criteria) this;
        }

        public Criteria andSemester1EqualTo(String value) {
            addCriterion("semester1 =", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1NotEqualTo(String value) {
            addCriterion("semester1 <>", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1GreaterThan(String value) {
            addCriterion("semester1 >", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1GreaterThanOrEqualTo(String value) {
            addCriterion("semester1 >=", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1LessThan(String value) {
            addCriterion("semester1 <", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1LessThanOrEqualTo(String value) {
            addCriterion("semester1 <=", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1Like(String value) {
            addCriterion("semester1 like", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1NotLike(String value) {
            addCriterion("semester1 not like", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1In(List<String> values) {
            addCriterion("semester1 in", values, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1NotIn(List<String> values) {
            addCriterion("semester1 not in", values, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1Between(String value1, String value2) {
            addCriterion("semester1 between", value1, value2, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1NotBetween(String value1, String value2) {
            addCriterion("semester1 not between", value1, value2, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester2IsNull() {
            addCriterion("semester2 is null");
            return (Criteria) this;
        }

        public Criteria andSemester2IsNotNull() {
            addCriterion("semester2 is not null");
            return (Criteria) this;
        }

        public Criteria andSemester2EqualTo(String value) {
            addCriterion("semester2 =", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2NotEqualTo(String value) {
            addCriterion("semester2 <>", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2GreaterThan(String value) {
            addCriterion("semester2 >", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2GreaterThanOrEqualTo(String value) {
            addCriterion("semester2 >=", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2LessThan(String value) {
            addCriterion("semester2 <", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2LessThanOrEqualTo(String value) {
            addCriterion("semester2 <=", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2Like(String value) {
            addCriterion("semester2 like", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2NotLike(String value) {
            addCriterion("semester2 not like", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2In(List<String> values) {
            addCriterion("semester2 in", values, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2NotIn(List<String> values) {
            addCriterion("semester2 not in", values, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2Between(String value1, String value2) {
            addCriterion("semester2 between", value1, value2, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2NotBetween(String value1, String value2) {
            addCriterion("semester2 not between", value1, value2, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester3IsNull() {
            addCriterion("semester3 is null");
            return (Criteria) this;
        }

        public Criteria andSemester3IsNotNull() {
            addCriterion("semester3 is not null");
            return (Criteria) this;
        }

        public Criteria andSemester3EqualTo(String value) {
            addCriterion("semester3 =", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3NotEqualTo(String value) {
            addCriterion("semester3 <>", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3GreaterThan(String value) {
            addCriterion("semester3 >", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3GreaterThanOrEqualTo(String value) {
            addCriterion("semester3 >=", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3LessThan(String value) {
            addCriterion("semester3 <", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3LessThanOrEqualTo(String value) {
            addCriterion("semester3 <=", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3Like(String value) {
            addCriterion("semester3 like", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3NotLike(String value) {
            addCriterion("semester3 not like", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3In(List<String> values) {
            addCriterion("semester3 in", values, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3NotIn(List<String> values) {
            addCriterion("semester3 not in", values, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3Between(String value1, String value2) {
            addCriterion("semester3 between", value1, value2, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3NotBetween(String value1, String value2) {
            addCriterion("semester3 not between", value1, value2, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester4IsNull() {
            addCriterion("semester4 is null");
            return (Criteria) this;
        }

        public Criteria andSemester4IsNotNull() {
            addCriterion("semester4 is not null");
            return (Criteria) this;
        }

        public Criteria andSemester4EqualTo(String value) {
            addCriterion("semester4 =", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4NotEqualTo(String value) {
            addCriterion("semester4 <>", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4GreaterThan(String value) {
            addCriterion("semester4 >", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4GreaterThanOrEqualTo(String value) {
            addCriterion("semester4 >=", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4LessThan(String value) {
            addCriterion("semester4 <", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4LessThanOrEqualTo(String value) {
            addCriterion("semester4 <=", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4Like(String value) {
            addCriterion("semester4 like", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4NotLike(String value) {
            addCriterion("semester4 not like", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4In(List<String> values) {
            addCriterion("semester4 in", values, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4NotIn(List<String> values) {
            addCriterion("semester4 not in", values, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4Between(String value1, String value2) {
            addCriterion("semester4 between", value1, value2, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4NotBetween(String value1, String value2) {
            addCriterion("semester4 not between", value1, value2, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester5IsNull() {
            addCriterion("semester5 is null");
            return (Criteria) this;
        }

        public Criteria andSemester5IsNotNull() {
            addCriterion("semester5 is not null");
            return (Criteria) this;
        }

        public Criteria andSemester5EqualTo(String value) {
            addCriterion("semester5 =", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5NotEqualTo(String value) {
            addCriterion("semester5 <>", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5GreaterThan(String value) {
            addCriterion("semester5 >", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5GreaterThanOrEqualTo(String value) {
            addCriterion("semester5 >=", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5LessThan(String value) {
            addCriterion("semester5 <", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5LessThanOrEqualTo(String value) {
            addCriterion("semester5 <=", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5Like(String value) {
            addCriterion("semester5 like", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5NotLike(String value) {
            addCriterion("semester5 not like", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5In(List<String> values) {
            addCriterion("semester5 in", values, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5NotIn(List<String> values) {
            addCriterion("semester5 not in", values, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5Between(String value1, String value2) {
            addCriterion("semester5 between", value1, value2, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5NotBetween(String value1, String value2) {
            addCriterion("semester5 not between", value1, value2, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester6IsNull() {
            addCriterion("semester6 is null");
            return (Criteria) this;
        }

        public Criteria andSemester6IsNotNull() {
            addCriterion("semester6 is not null");
            return (Criteria) this;
        }

        public Criteria andSemester6EqualTo(String value) {
            addCriterion("semester6 =", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6NotEqualTo(String value) {
            addCriterion("semester6 <>", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6GreaterThan(String value) {
            addCriterion("semester6 >", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6GreaterThanOrEqualTo(String value) {
            addCriterion("semester6 >=", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6LessThan(String value) {
            addCriterion("semester6 <", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6LessThanOrEqualTo(String value) {
            addCriterion("semester6 <=", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6Like(String value) {
            addCriterion("semester6 like", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6NotLike(String value) {
            addCriterion("semester6 not like", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6In(List<String> values) {
            addCriterion("semester6 in", values, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6NotIn(List<String> values) {
            addCriterion("semester6 not in", values, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6Between(String value1, String value2) {
            addCriterion("semester6 between", value1, value2, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6NotBetween(String value1, String value2) {
            addCriterion("semester6 not between", value1, value2, "semester6");
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