package com.ray.cloud.framework.mybatis.entity;

import com.ray.cloud.framework.base.example.BaseExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DPersonProcessExample extends BaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DPersonProcessExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNull() {
            addCriterion("PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(String value) {
            addCriterion("PERSON_ID =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(String value) {
            addCriterion("PERSON_ID <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(String value) {
            addCriterion("PERSON_ID >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON_ID >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(String value) {
            addCriterion("PERSON_ID <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(String value) {
            addCriterion("PERSON_ID <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLike(String value) {
            addCriterion("PERSON_ID like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotLike(String value) {
            addCriterion("PERSON_ID not like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<String> values) {
            addCriterion("PERSON_ID in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<String> values) {
            addCriterion("PERSON_ID not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(String value1, String value2) {
            addCriterion("PERSON_ID between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(String value1, String value2) {
            addCriterion("PERSON_ID not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andRecommendPositionIsNull() {
            addCriterion("RECOMMEND_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andRecommendPositionIsNotNull() {
            addCriterion("RECOMMEND_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendPositionEqualTo(Integer value) {
            addCriterion("RECOMMEND_POSITION =", value, "recommendPosition");
            return (Criteria) this;
        }

        public Criteria andRecommendPositionNotEqualTo(Integer value) {
            addCriterion("RECOMMEND_POSITION <>", value, "recommendPosition");
            return (Criteria) this;
        }

        public Criteria andRecommendPositionGreaterThan(Integer value) {
            addCriterion("RECOMMEND_POSITION >", value, "recommendPosition");
            return (Criteria) this;
        }

        public Criteria andRecommendPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECOMMEND_POSITION >=", value, "recommendPosition");
            return (Criteria) this;
        }

        public Criteria andRecommendPositionLessThan(Integer value) {
            addCriterion("RECOMMEND_POSITION <", value, "recommendPosition");
            return (Criteria) this;
        }

        public Criteria andRecommendPositionLessThanOrEqualTo(Integer value) {
            addCriterion("RECOMMEND_POSITION <=", value, "recommendPosition");
            return (Criteria) this;
        }

        public Criteria andRecommendPositionIn(List<Integer> values) {
            addCriterion("RECOMMEND_POSITION in", values, "recommendPosition");
            return (Criteria) this;
        }

        public Criteria andRecommendPositionNotIn(List<Integer> values) {
            addCriterion("RECOMMEND_POSITION not in", values, "recommendPosition");
            return (Criteria) this;
        }

        public Criteria andRecommendPositionBetween(Integer value1, Integer value2) {
            addCriterion("RECOMMEND_POSITION between", value1, value2, "recommendPosition");
            return (Criteria) this;
        }

        public Criteria andRecommendPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("RECOMMEND_POSITION not between", value1, value2, "recommendPosition");
            return (Criteria) this;
        }

        public Criteria andBuIsNull() {
            addCriterion("BU is null");
            return (Criteria) this;
        }

        public Criteria andBuIsNotNull() {
            addCriterion("BU is not null");
            return (Criteria) this;
        }

        public Criteria andBuEqualTo(Integer value) {
            addCriterion("BU =", value, "bu");
            return (Criteria) this;
        }

        public Criteria andBuNotEqualTo(Integer value) {
            addCriterion("BU <>", value, "bu");
            return (Criteria) this;
        }

        public Criteria andBuGreaterThan(Integer value) {
            addCriterion("BU >", value, "bu");
            return (Criteria) this;
        }

        public Criteria andBuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BU >=", value, "bu");
            return (Criteria) this;
        }

        public Criteria andBuLessThan(Integer value) {
            addCriterion("BU <", value, "bu");
            return (Criteria) this;
        }

        public Criteria andBuLessThanOrEqualTo(Integer value) {
            addCriterion("BU <=", value, "bu");
            return (Criteria) this;
        }

        public Criteria andBuIn(List<Integer> values) {
            addCriterion("BU in", values, "bu");
            return (Criteria) this;
        }

        public Criteria andBuNotIn(List<Integer> values) {
            addCriterion("BU not in", values, "bu");
            return (Criteria) this;
        }

        public Criteria andBuBetween(Integer value1, Integer value2) {
            addCriterion("BU between", value1, value2, "bu");
            return (Criteria) this;
        }

        public Criteria andBuNotBetween(Integer value1, Integer value2) {
            addCriterion("BU not between", value1, value2, "bu");
            return (Criteria) this;
        }

        public Criteria andDeliveDepartmentIsNull() {
            addCriterion("DELIVE_DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDeliveDepartmentIsNotNull() {
            addCriterion("DELIVE_DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveDepartmentEqualTo(Integer value) {
            addCriterion("DELIVE_DEPARTMENT =", value, "deliveDepartment");
            return (Criteria) this;
        }

        public Criteria andDeliveDepartmentNotEqualTo(Integer value) {
            addCriterion("DELIVE_DEPARTMENT <>", value, "deliveDepartment");
            return (Criteria) this;
        }

        public Criteria andDeliveDepartmentGreaterThan(Integer value) {
            addCriterion("DELIVE_DEPARTMENT >", value, "deliveDepartment");
            return (Criteria) this;
        }

        public Criteria andDeliveDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELIVE_DEPARTMENT >=", value, "deliveDepartment");
            return (Criteria) this;
        }

        public Criteria andDeliveDepartmentLessThan(Integer value) {
            addCriterion("DELIVE_DEPARTMENT <", value, "deliveDepartment");
            return (Criteria) this;
        }

        public Criteria andDeliveDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("DELIVE_DEPARTMENT <=", value, "deliveDepartment");
            return (Criteria) this;
        }

        public Criteria andDeliveDepartmentIn(List<Integer> values) {
            addCriterion("DELIVE_DEPARTMENT in", values, "deliveDepartment");
            return (Criteria) this;
        }

        public Criteria andDeliveDepartmentNotIn(List<Integer> values) {
            addCriterion("DELIVE_DEPARTMENT not in", values, "deliveDepartment");
            return (Criteria) this;
        }

        public Criteria andDeliveDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("DELIVE_DEPARTMENT between", value1, value2, "deliveDepartment");
            return (Criteria) this;
        }

        public Criteria andDeliveDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("DELIVE_DEPARTMENT not between", value1, value2, "deliveDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(Integer value) {
            addCriterion("PROJECT =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(Integer value) {
            addCriterion("PROJECT <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(Integer value) {
            addCriterion("PROJECT >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROJECT >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(Integer value) {
            addCriterion("PROJECT <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(Integer value) {
            addCriterion("PROJECT <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<Integer> values) {
            addCriterion("PROJECT in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<Integer> values) {
            addCriterion("PROJECT not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("JOB is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("JOB is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(Integer value) {
            addCriterion("JOB =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(Integer value) {
            addCriterion("JOB <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(Integer value) {
            addCriterion("JOB >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(Integer value) {
            addCriterion("JOB >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(Integer value) {
            addCriterion("JOB <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(Integer value) {
            addCriterion("JOB <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<Integer> values) {
            addCriterion("JOB in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<Integer> values) {
            addCriterion("JOB not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(Integer value1, Integer value2) {
            addCriterion("JOB between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(Integer value1, Integer value2) {
            addCriterion("JOB not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNull() {
            addCriterion("SUBMIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNotNull() {
            addCriterion("SUBMIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateEqualTo(Date value) {
            addCriterion("SUBMIT_DATE =", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotEqualTo(Date value) {
            addCriterion("SUBMIT_DATE <>", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThan(Date value) {
            addCriterion("SUBMIT_DATE >", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SUBMIT_DATE >=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThan(Date value) {
            addCriterion("SUBMIT_DATE <", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThanOrEqualTo(Date value) {
            addCriterion("SUBMIT_DATE <=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIn(List<Date> values) {
            addCriterion("SUBMIT_DATE in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotIn(List<Date> values) {
            addCriterion("SUBMIT_DATE not in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateBetween(Date value1, Date value2) {
            addCriterion("SUBMIT_DATE between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotBetween(Date value1, Date value2) {
            addCriterion("SUBMIT_DATE not between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andComeFromIsNull() {
            addCriterion("COME_FROM is null");
            return (Criteria) this;
        }

        public Criteria andComeFromIsNotNull() {
            addCriterion("COME_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andComeFromEqualTo(Integer value) {
            addCriterion("COME_FROM =", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotEqualTo(Integer value) {
            addCriterion("COME_FROM <>", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromGreaterThan(Integer value) {
            addCriterion("COME_FROM >", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("COME_FROM >=", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromLessThan(Integer value) {
            addCriterion("COME_FROM <", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromLessThanOrEqualTo(Integer value) {
            addCriterion("COME_FROM <=", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromIn(List<Integer> values) {
            addCriterion("COME_FROM in", values, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotIn(List<Integer> values) {
            addCriterion("COME_FROM not in", values, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromBetween(Integer value1, Integer value2) {
            addCriterion("COME_FROM between", value1, value2, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotBetween(Integer value1, Integer value2) {
            addCriterion("COME_FROM not between", value1, value2, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andFirstInterviewIsNull() {
            addCriterion("FIRST_INTERVIEW is null");
            return (Criteria) this;
        }

        public Criteria andFirstInterviewIsNotNull() {
            addCriterion("FIRST_INTERVIEW is not null");
            return (Criteria) this;
        }

        public Criteria andFirstInterviewEqualTo(Date value) {
            addCriterion("FIRST_INTERVIEW =", value, "firstInterview");
            return (Criteria) this;
        }

        public Criteria andFirstInterviewNotEqualTo(Date value) {
            addCriterion("FIRST_INTERVIEW <>", value, "firstInterview");
            return (Criteria) this;
        }

        public Criteria andFirstInterviewGreaterThan(Date value) {
            addCriterion("FIRST_INTERVIEW >", value, "firstInterview");
            return (Criteria) this;
        }

        public Criteria andFirstInterviewGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRST_INTERVIEW >=", value, "firstInterview");
            return (Criteria) this;
        }

        public Criteria andFirstInterviewLessThan(Date value) {
            addCriterion("FIRST_INTERVIEW <", value, "firstInterview");
            return (Criteria) this;
        }

        public Criteria andFirstInterviewLessThanOrEqualTo(Date value) {
            addCriterion("FIRST_INTERVIEW <=", value, "firstInterview");
            return (Criteria) this;
        }

        public Criteria andFirstInterviewIn(List<Date> values) {
            addCriterion("FIRST_INTERVIEW in", values, "firstInterview");
            return (Criteria) this;
        }

        public Criteria andFirstInterviewNotIn(List<Date> values) {
            addCriterion("FIRST_INTERVIEW not in", values, "firstInterview");
            return (Criteria) this;
        }

        public Criteria andFirstInterviewBetween(Date value1, Date value2) {
            addCriterion("FIRST_INTERVIEW between", value1, value2, "firstInterview");
            return (Criteria) this;
        }

        public Criteria andFirstInterviewNotBetween(Date value1, Date value2) {
            addCriterion("FIRST_INTERVIEW not between", value1, value2, "firstInterview");
            return (Criteria) this;
        }

        public Criteria andSecondInterviewIsNull() {
            addCriterion("SECOND_INTERVIEW is null");
            return (Criteria) this;
        }

        public Criteria andSecondInterviewIsNotNull() {
            addCriterion("SECOND_INTERVIEW is not null");
            return (Criteria) this;
        }

        public Criteria andSecondInterviewEqualTo(Date value) {
            addCriterion("SECOND_INTERVIEW =", value, "secondInterview");
            return (Criteria) this;
        }

        public Criteria andSecondInterviewNotEqualTo(Date value) {
            addCriterion("SECOND_INTERVIEW <>", value, "secondInterview");
            return (Criteria) this;
        }

        public Criteria andSecondInterviewGreaterThan(Date value) {
            addCriterion("SECOND_INTERVIEW >", value, "secondInterview");
            return (Criteria) this;
        }

        public Criteria andSecondInterviewGreaterThanOrEqualTo(Date value) {
            addCriterion("SECOND_INTERVIEW >=", value, "secondInterview");
            return (Criteria) this;
        }

        public Criteria andSecondInterviewLessThan(Date value) {
            addCriterion("SECOND_INTERVIEW <", value, "secondInterview");
            return (Criteria) this;
        }

        public Criteria andSecondInterviewLessThanOrEqualTo(Date value) {
            addCriterion("SECOND_INTERVIEW <=", value, "secondInterview");
            return (Criteria) this;
        }

        public Criteria andSecondInterviewIn(List<Date> values) {
            addCriterion("SECOND_INTERVIEW in", values, "secondInterview");
            return (Criteria) this;
        }

        public Criteria andSecondInterviewNotIn(List<Date> values) {
            addCriterion("SECOND_INTERVIEW not in", values, "secondInterview");
            return (Criteria) this;
        }

        public Criteria andSecondInterviewBetween(Date value1, Date value2) {
            addCriterion("SECOND_INTERVIEW between", value1, value2, "secondInterview");
            return (Criteria) this;
        }

        public Criteria andSecondInterviewNotBetween(Date value1, Date value2) {
            addCriterion("SECOND_INTERVIEW not between", value1, value2, "secondInterview");
            return (Criteria) this;
        }

        public Criteria andJoinInIsNull() {
            addCriterion("JOIN_IN is null");
            return (Criteria) this;
        }

        public Criteria andJoinInIsNotNull() {
            addCriterion("JOIN_IN is not null");
            return (Criteria) this;
        }

        public Criteria andJoinInEqualTo(Date value) {
            addCriterion("JOIN_IN =", value, "joinIn");
            return (Criteria) this;
        }

        public Criteria andJoinInNotEqualTo(Date value) {
            addCriterion("JOIN_IN <>", value, "joinIn");
            return (Criteria) this;
        }

        public Criteria andJoinInGreaterThan(Date value) {
            addCriterion("JOIN_IN >", value, "joinIn");
            return (Criteria) this;
        }

        public Criteria andJoinInGreaterThanOrEqualTo(Date value) {
            addCriterion("JOIN_IN >=", value, "joinIn");
            return (Criteria) this;
        }

        public Criteria andJoinInLessThan(Date value) {
            addCriterion("JOIN_IN <", value, "joinIn");
            return (Criteria) this;
        }

        public Criteria andJoinInLessThanOrEqualTo(Date value) {
            addCriterion("JOIN_IN <=", value, "joinIn");
            return (Criteria) this;
        }

        public Criteria andJoinInIn(List<Date> values) {
            addCriterion("JOIN_IN in", values, "joinIn");
            return (Criteria) this;
        }

        public Criteria andJoinInNotIn(List<Date> values) {
            addCriterion("JOIN_IN not in", values, "joinIn");
            return (Criteria) this;
        }

        public Criteria andJoinInBetween(Date value1, Date value2) {
            addCriterion("JOIN_IN between", value1, value2, "joinIn");
            return (Criteria) this;
        }

        public Criteria andJoinInNotBetween(Date value1, Date value2) {
            addCriterion("JOIN_IN not between", value1, value2, "joinIn");
            return (Criteria) this;
        }

        public Criteria andQuitDateIsNull() {
            addCriterion("QUIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andQuitDateIsNotNull() {
            addCriterion("QUIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andQuitDateEqualTo(Date value) {
            addCriterion("QUIT_DATE =", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotEqualTo(Date value) {
            addCriterion("QUIT_DATE <>", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateGreaterThan(Date value) {
            addCriterion("QUIT_DATE >", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("QUIT_DATE >=", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateLessThan(Date value) {
            addCriterion("QUIT_DATE <", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateLessThanOrEqualTo(Date value) {
            addCriterion("QUIT_DATE <=", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateIn(List<Date> values) {
            addCriterion("QUIT_DATE in", values, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotIn(List<Date> values) {
            addCriterion("QUIT_DATE not in", values, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateBetween(Date value1, Date value2) {
            addCriterion("QUIT_DATE between", value1, value2, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotBetween(Date value1, Date value2) {
            addCriterion("QUIT_DATE not between", value1, value2, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitReasonIsNull() {
            addCriterion("QUIT_REASON is null");
            return (Criteria) this;
        }

        public Criteria andQuitReasonIsNotNull() {
            addCriterion("QUIT_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andQuitReasonEqualTo(String value) {
            addCriterion("QUIT_REASON =", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotEqualTo(String value) {
            addCriterion("QUIT_REASON <>", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonGreaterThan(String value) {
            addCriterion("QUIT_REASON >", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonGreaterThanOrEqualTo(String value) {
            addCriterion("QUIT_REASON >=", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonLessThan(String value) {
            addCriterion("QUIT_REASON <", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonLessThanOrEqualTo(String value) {
            addCriterion("QUIT_REASON <=", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonLike(String value) {
            addCriterion("QUIT_REASON like", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotLike(String value) {
            addCriterion("QUIT_REASON not like", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonIn(List<String> values) {
            addCriterion("QUIT_REASON in", values, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotIn(List<String> values) {
            addCriterion("QUIT_REASON not in", values, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonBetween(String value1, String value2) {
            addCriterion("QUIT_REASON between", value1, value2, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotBetween(String value1, String value2) {
            addCriterion("QUIT_REASON not between", value1, value2, "quitReason");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDataFlagIsNull() {
            addCriterion("DATA_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDataFlagIsNotNull() {
            addCriterion("DATA_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDataFlagEqualTo(Integer value) {
            addCriterion("DATA_FLAG =", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotEqualTo(Integer value) {
            addCriterion("DATA_FLAG <>", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagGreaterThan(Integer value) {
            addCriterion("DATA_FLAG >", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("DATA_FLAG >=", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLessThan(Integer value) {
            addCriterion("DATA_FLAG <", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLessThanOrEqualTo(Integer value) {
            addCriterion("DATA_FLAG <=", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagIn(List<Integer> values) {
            addCriterion("DATA_FLAG in", values, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotIn(List<Integer> values) {
            addCriterion("DATA_FLAG not in", values, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagBetween(Integer value1, Integer value2) {
            addCriterion("DATA_FLAG between", value1, value2, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("DATA_FLAG not between", value1, value2, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_USER like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_USER not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemIsNull() {
            addCriterion("UPDATE_TIEM is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemIsNotNull() {
            addCriterion("UPDATE_TIEM is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemEqualTo(Date value) {
            addCriterion("UPDATE_TIEM =", value, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemNotEqualTo(Date value) {
            addCriterion("UPDATE_TIEM <>", value, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemGreaterThan(Date value) {
            addCriterion("UPDATE_TIEM >", value, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIEM >=", value, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemLessThan(Date value) {
            addCriterion("UPDATE_TIEM <", value, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIEM <=", value, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemIn(List<Date> values) {
            addCriterion("UPDATE_TIEM in", values, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemNotIn(List<Date> values) {
            addCriterion("UPDATE_TIEM not in", values, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIEM between", value1, value2, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIEM not between", value1, value2, "updateTiem");
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
    }
}