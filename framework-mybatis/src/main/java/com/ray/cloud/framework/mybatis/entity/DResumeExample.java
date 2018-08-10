package com.ray.cloud.framework.mybatis.entity;

import com.ray.cloud.framework.base.example.BaseExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DResumeExample extends BaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DResumeExample() {
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

        public Criteria andResumeNameIsNull() {
            addCriterion("RESUME_NAME is null");
            return (Criteria) this;
        }

        public Criteria andResumeNameIsNotNull() {
            addCriterion("RESUME_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andResumeNameEqualTo(String value) {
            addCriterion("RESUME_NAME =", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotEqualTo(String value) {
            addCriterion("RESUME_NAME <>", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameGreaterThan(String value) {
            addCriterion("RESUME_NAME >", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameGreaterThanOrEqualTo(String value) {
            addCriterion("RESUME_NAME >=", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameLessThan(String value) {
            addCriterion("RESUME_NAME <", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameLessThanOrEqualTo(String value) {
            addCriterion("RESUME_NAME <=", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameLike(String value) {
            addCriterion("RESUME_NAME like", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotLike(String value) {
            addCriterion("RESUME_NAME not like", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameIn(List<String> values) {
            addCriterion("RESUME_NAME in", values, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotIn(List<String> values) {
            addCriterion("RESUME_NAME not in", values, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameBetween(String value1, String value2) {
            addCriterion("RESUME_NAME between", value1, value2, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotBetween(String value1, String value2) {
            addCriterion("RESUME_NAME not between", value1, value2, "resumeName");
            return (Criteria) this;
        }

        public Criteria andTagNameIsNull() {
            addCriterion("TAG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTagNameIsNotNull() {
            addCriterion("TAG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTagNameEqualTo(String value) {
            addCriterion("TAG_NAME =", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotEqualTo(String value) {
            addCriterion("TAG_NAME <>", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameGreaterThan(String value) {
            addCriterion("TAG_NAME >", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameGreaterThanOrEqualTo(String value) {
            addCriterion("TAG_NAME >=", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLessThan(String value) {
            addCriterion("TAG_NAME <", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLessThanOrEqualTo(String value) {
            addCriterion("TAG_NAME <=", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLike(String value) {
            addCriterion("TAG_NAME like", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotLike(String value) {
            addCriterion("TAG_NAME not like", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameIn(List<String> values) {
            addCriterion("TAG_NAME in", values, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotIn(List<String> values) {
            addCriterion("TAG_NAME not in", values, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameBetween(String value1, String value2) {
            addCriterion("TAG_NAME between", value1, value2, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotBetween(String value1, String value2) {
            addCriterion("TAG_NAME not between", value1, value2, "tagName");
            return (Criteria) this;
        }

        public Criteria andJobPositionIsNull() {
            addCriterion("JOB_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andJobPositionIsNotNull() {
            addCriterion("JOB_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andJobPositionEqualTo(String value) {
            addCriterion("JOB_POSITION =", value, "jobPosition");
            return (Criteria) this;
        }

        public Criteria andJobPositionNotEqualTo(String value) {
            addCriterion("JOB_POSITION <>", value, "jobPosition");
            return (Criteria) this;
        }

        public Criteria andJobPositionGreaterThan(String value) {
            addCriterion("JOB_POSITION >", value, "jobPosition");
            return (Criteria) this;
        }

        public Criteria andJobPositionGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_POSITION >=", value, "jobPosition");
            return (Criteria) this;
        }

        public Criteria andJobPositionLessThan(String value) {
            addCriterion("JOB_POSITION <", value, "jobPosition");
            return (Criteria) this;
        }

        public Criteria andJobPositionLessThanOrEqualTo(String value) {
            addCriterion("JOB_POSITION <=", value, "jobPosition");
            return (Criteria) this;
        }

        public Criteria andJobPositionLike(String value) {
            addCriterion("JOB_POSITION like", value, "jobPosition");
            return (Criteria) this;
        }

        public Criteria andJobPositionNotLike(String value) {
            addCriterion("JOB_POSITION not like", value, "jobPosition");
            return (Criteria) this;
        }

        public Criteria andJobPositionIn(List<String> values) {
            addCriterion("JOB_POSITION in", values, "jobPosition");
            return (Criteria) this;
        }

        public Criteria andJobPositionNotIn(List<String> values) {
            addCriterion("JOB_POSITION not in", values, "jobPosition");
            return (Criteria) this;
        }

        public Criteria andJobPositionBetween(String value1, String value2) {
            addCriterion("JOB_POSITION between", value1, value2, "jobPosition");
            return (Criteria) this;
        }

        public Criteria andJobPositionNotBetween(String value1, String value2) {
            addCriterion("JOB_POSITION not between", value1, value2, "jobPosition");
            return (Criteria) this;
        }

        public Criteria andWorkYearsIsNull() {
            addCriterion("WORK_YEARS is null");
            return (Criteria) this;
        }

        public Criteria andWorkYearsIsNotNull() {
            addCriterion("WORK_YEARS is not null");
            return (Criteria) this;
        }

        public Criteria andWorkYearsEqualTo(String value) {
            addCriterion("WORK_YEARS =", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsNotEqualTo(String value) {
            addCriterion("WORK_YEARS <>", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsGreaterThan(String value) {
            addCriterion("WORK_YEARS >", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_YEARS >=", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsLessThan(String value) {
            addCriterion("WORK_YEARS <", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsLessThanOrEqualTo(String value) {
            addCriterion("WORK_YEARS <=", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsLike(String value) {
            addCriterion("WORK_YEARS like", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsNotLike(String value) {
            addCriterion("WORK_YEARS not like", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsIn(List<String> values) {
            addCriterion("WORK_YEARS in", values, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsNotIn(List<String> values) {
            addCriterion("WORK_YEARS not in", values, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsBetween(String value1, String value2) {
            addCriterion("WORK_YEARS between", value1, value2, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsNotBetween(String value1, String value2) {
            addCriterion("WORK_YEARS not between", value1, value2, "workYears");
            return (Criteria) this;
        }

        public Criteria andCurrentCompanyIsNull() {
            addCriterion("CURRENT_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCompanyIsNotNull() {
            addCriterion("CURRENT_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCompanyEqualTo(String value) {
            addCriterion("CURRENT_COMPANY =", value, "currentCompany");
            return (Criteria) this;
        }

        public Criteria andCurrentCompanyNotEqualTo(String value) {
            addCriterion("CURRENT_COMPANY <>", value, "currentCompany");
            return (Criteria) this;
        }

        public Criteria andCurrentCompanyGreaterThan(String value) {
            addCriterion("CURRENT_COMPANY >", value, "currentCompany");
            return (Criteria) this;
        }

        public Criteria andCurrentCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_COMPANY >=", value, "currentCompany");
            return (Criteria) this;
        }

        public Criteria andCurrentCompanyLessThan(String value) {
            addCriterion("CURRENT_COMPANY <", value, "currentCompany");
            return (Criteria) this;
        }

        public Criteria andCurrentCompanyLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_COMPANY <=", value, "currentCompany");
            return (Criteria) this;
        }

        public Criteria andCurrentCompanyLike(String value) {
            addCriterion("CURRENT_COMPANY like", value, "currentCompany");
            return (Criteria) this;
        }

        public Criteria andCurrentCompanyNotLike(String value) {
            addCriterion("CURRENT_COMPANY not like", value, "currentCompany");
            return (Criteria) this;
        }

        public Criteria andCurrentCompanyIn(List<String> values) {
            addCriterion("CURRENT_COMPANY in", values, "currentCompany");
            return (Criteria) this;
        }

        public Criteria andCurrentCompanyNotIn(List<String> values) {
            addCriterion("CURRENT_COMPANY not in", values, "currentCompany");
            return (Criteria) this;
        }

        public Criteria andCurrentCompanyBetween(String value1, String value2) {
            addCriterion("CURRENT_COMPANY between", value1, value2, "currentCompany");
            return (Criteria) this;
        }

        public Criteria andCurrentCompanyNotBetween(String value1, String value2) {
            addCriterion("CURRENT_COMPANY not between", value1, value2, "currentCompany");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryIsNull() {
            addCriterion("EXPECT_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryIsNotNull() {
            addCriterion("EXPECT_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryEqualTo(String value) {
            addCriterion("EXPECT_SALARY =", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryNotEqualTo(String value) {
            addCriterion("EXPECT_SALARY <>", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryGreaterThan(String value) {
            addCriterion("EXPECT_SALARY >", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("EXPECT_SALARY >=", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryLessThan(String value) {
            addCriterion("EXPECT_SALARY <", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryLessThanOrEqualTo(String value) {
            addCriterion("EXPECT_SALARY <=", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryLike(String value) {
            addCriterion("EXPECT_SALARY like", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryNotLike(String value) {
            addCriterion("EXPECT_SALARY not like", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryIn(List<String> values) {
            addCriterion("EXPECT_SALARY in", values, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryNotIn(List<String> values) {
            addCriterion("EXPECT_SALARY not in", values, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryBetween(String value1, String value2) {
            addCriterion("EXPECT_SALARY between", value1, value2, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryNotBetween(String value1, String value2) {
            addCriterion("EXPECT_SALARY not between", value1, value2, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNull() {
            addCriterion("DELIVERY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNotNull() {
            addCriterion("DELIVERY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEqualTo(Date value) {
            addCriterion("DELIVERY_DATE =", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotEqualTo(Date value) {
            addCriterion("DELIVERY_DATE <>", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThan(Date value) {
            addCriterion("DELIVERY_DATE >", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERY_DATE >=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThan(Date value) {
            addCriterion("DELIVERY_DATE <", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERY_DATE <=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIn(List<Date> values) {
            addCriterion("DELIVERY_DATE in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotIn(List<Date> values) {
            addCriterion("DELIVERY_DATE not in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateBetween(Date value1, Date value2) {
            addCriterion("DELIVERY_DATE between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERY_DATE not between", value1, value2, "deliveryDate");
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

        public Criteria andUpdateTmieIsNull() {
            addCriterion("UPDATE_TMIE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTmieIsNotNull() {
            addCriterion("UPDATE_TMIE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTmieEqualTo(Date value) {
            addCriterion("UPDATE_TMIE =", value, "updateTmie");
            return (Criteria) this;
        }

        public Criteria andUpdateTmieNotEqualTo(Date value) {
            addCriterion("UPDATE_TMIE <>", value, "updateTmie");
            return (Criteria) this;
        }

        public Criteria andUpdateTmieGreaterThan(Date value) {
            addCriterion("UPDATE_TMIE >", value, "updateTmie");
            return (Criteria) this;
        }

        public Criteria andUpdateTmieGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TMIE >=", value, "updateTmie");
            return (Criteria) this;
        }

        public Criteria andUpdateTmieLessThan(Date value) {
            addCriterion("UPDATE_TMIE <", value, "updateTmie");
            return (Criteria) this;
        }

        public Criteria andUpdateTmieLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TMIE <=", value, "updateTmie");
            return (Criteria) this;
        }

        public Criteria andUpdateTmieIn(List<Date> values) {
            addCriterion("UPDATE_TMIE in", values, "updateTmie");
            return (Criteria) this;
        }

        public Criteria andUpdateTmieNotIn(List<Date> values) {
            addCriterion("UPDATE_TMIE not in", values, "updateTmie");
            return (Criteria) this;
        }

        public Criteria andUpdateTmieBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TMIE between", value1, value2, "updateTmie");
            return (Criteria) this;
        }

        public Criteria andUpdateTmieNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TMIE not between", value1, value2, "updateTmie");
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