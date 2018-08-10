package com.ray.cloud.framework.mybatis.entity;

import com.ray.cloud.framework.base.example.BaseExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DPersonOtherExample extends BaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DPersonOtherExample() {
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

        public Criteria andTrainIdIsNull() {
            addCriterion("TRAIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTrainIdIsNotNull() {
            addCriterion("TRAIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTrainIdEqualTo(String value) {
            addCriterion("TRAIN_ID =", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotEqualTo(String value) {
            addCriterion("TRAIN_ID <>", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThan(String value) {
            addCriterion("TRAIN_ID >", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRAIN_ID >=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThan(String value) {
            addCriterion("TRAIN_ID <", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThanOrEqualTo(String value) {
            addCriterion("TRAIN_ID <=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLike(String value) {
            addCriterion("TRAIN_ID like", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotLike(String value) {
            addCriterion("TRAIN_ID not like", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdIn(List<String> values) {
            addCriterion("TRAIN_ID in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotIn(List<String> values) {
            addCriterion("TRAIN_ID not in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdBetween(String value1, String value2) {
            addCriterion("TRAIN_ID between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotBetween(String value1, String value2) {
            addCriterion("TRAIN_ID not between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("CARD_ID =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("CARD_ID <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("CARD_ID >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_ID >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("CARD_ID <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("CARD_ID <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("CARD_ID like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("CARD_ID not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("CARD_ID in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("CARD_ID not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("CARD_ID between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("CARD_ID not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundIsNull() {
            addCriterion("EDUCATION_BACKGROUND is null");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundIsNotNull() {
            addCriterion("EDUCATION_BACKGROUND is not null");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundEqualTo(String value) {
            addCriterion("EDUCATION_BACKGROUND =", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotEqualTo(String value) {
            addCriterion("EDUCATION_BACKGROUND <>", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundGreaterThan(String value) {
            addCriterion("EDUCATION_BACKGROUND >", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION_BACKGROUND >=", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundLessThan(String value) {
            addCriterion("EDUCATION_BACKGROUND <", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION_BACKGROUND <=", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundLike(String value) {
            addCriterion("EDUCATION_BACKGROUND like", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotLike(String value) {
            addCriterion("EDUCATION_BACKGROUND not like", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundIn(List<String> values) {
            addCriterion("EDUCATION_BACKGROUND in", values, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotIn(List<String> values) {
            addCriterion("EDUCATION_BACKGROUND not in", values, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundBetween(String value1, String value2) {
            addCriterion("EDUCATION_BACKGROUND between", value1, value2, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotBetween(String value1, String value2) {
            addCriterion("EDUCATION_BACKGROUND not between", value1, value2, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andLearnSituationIsNull() {
            addCriterion("LEARN_SITUATION is null");
            return (Criteria) this;
        }

        public Criteria andLearnSituationIsNotNull() {
            addCriterion("LEARN_SITUATION is not null");
            return (Criteria) this;
        }

        public Criteria andLearnSituationEqualTo(String value) {
            addCriterion("LEARN_SITUATION =", value, "learnSituation");
            return (Criteria) this;
        }

        public Criteria andLearnSituationNotEqualTo(String value) {
            addCriterion("LEARN_SITUATION <>", value, "learnSituation");
            return (Criteria) this;
        }

        public Criteria andLearnSituationGreaterThan(String value) {
            addCriterion("LEARN_SITUATION >", value, "learnSituation");
            return (Criteria) this;
        }

        public Criteria andLearnSituationGreaterThanOrEqualTo(String value) {
            addCriterion("LEARN_SITUATION >=", value, "learnSituation");
            return (Criteria) this;
        }

        public Criteria andLearnSituationLessThan(String value) {
            addCriterion("LEARN_SITUATION <", value, "learnSituation");
            return (Criteria) this;
        }

        public Criteria andLearnSituationLessThanOrEqualTo(String value) {
            addCriterion("LEARN_SITUATION <=", value, "learnSituation");
            return (Criteria) this;
        }

        public Criteria andLearnSituationLike(String value) {
            addCriterion("LEARN_SITUATION like", value, "learnSituation");
            return (Criteria) this;
        }

        public Criteria andLearnSituationNotLike(String value) {
            addCriterion("LEARN_SITUATION not like", value, "learnSituation");
            return (Criteria) this;
        }

        public Criteria andLearnSituationIn(List<String> values) {
            addCriterion("LEARN_SITUATION in", values, "learnSituation");
            return (Criteria) this;
        }

        public Criteria andLearnSituationNotIn(List<String> values) {
            addCriterion("LEARN_SITUATION not in", values, "learnSituation");
            return (Criteria) this;
        }

        public Criteria andLearnSituationBetween(String value1, String value2) {
            addCriterion("LEARN_SITUATION between", value1, value2, "learnSituation");
            return (Criteria) this;
        }

        public Criteria andLearnSituationNotBetween(String value1, String value2) {
            addCriterion("LEARN_SITUATION not between", value1, value2, "learnSituation");
            return (Criteria) this;
        }

        public Criteria andSocialSituationIsNull() {
            addCriterion("SOCIAL_SITUATION is null");
            return (Criteria) this;
        }

        public Criteria andSocialSituationIsNotNull() {
            addCriterion("SOCIAL_SITUATION is not null");
            return (Criteria) this;
        }

        public Criteria andSocialSituationEqualTo(String value) {
            addCriterion("SOCIAL_SITUATION =", value, "socialSituation");
            return (Criteria) this;
        }

        public Criteria andSocialSituationNotEqualTo(String value) {
            addCriterion("SOCIAL_SITUATION <>", value, "socialSituation");
            return (Criteria) this;
        }

        public Criteria andSocialSituationGreaterThan(String value) {
            addCriterion("SOCIAL_SITUATION >", value, "socialSituation");
            return (Criteria) this;
        }

        public Criteria andSocialSituationGreaterThanOrEqualTo(String value) {
            addCriterion("SOCIAL_SITUATION >=", value, "socialSituation");
            return (Criteria) this;
        }

        public Criteria andSocialSituationLessThan(String value) {
            addCriterion("SOCIAL_SITUATION <", value, "socialSituation");
            return (Criteria) this;
        }

        public Criteria andSocialSituationLessThanOrEqualTo(String value) {
            addCriterion("SOCIAL_SITUATION <=", value, "socialSituation");
            return (Criteria) this;
        }

        public Criteria andSocialSituationLike(String value) {
            addCriterion("SOCIAL_SITUATION like", value, "socialSituation");
            return (Criteria) this;
        }

        public Criteria andSocialSituationNotLike(String value) {
            addCriterion("SOCIAL_SITUATION not like", value, "socialSituation");
            return (Criteria) this;
        }

        public Criteria andSocialSituationIn(List<String> values) {
            addCriterion("SOCIAL_SITUATION in", values, "socialSituation");
            return (Criteria) this;
        }

        public Criteria andSocialSituationNotIn(List<String> values) {
            addCriterion("SOCIAL_SITUATION not in", values, "socialSituation");
            return (Criteria) this;
        }

        public Criteria andSocialSituationBetween(String value1, String value2) {
            addCriterion("SOCIAL_SITUATION between", value1, value2, "socialSituation");
            return (Criteria) this;
        }

        public Criteria andSocialSituationNotBetween(String value1, String value2) {
            addCriterion("SOCIAL_SITUATION not between", value1, value2, "socialSituation");
            return (Criteria) this;
        }

        public Criteria andLanguageSituationIsNull() {
            addCriterion("LANGUAGE_SITUATION is null");
            return (Criteria) this;
        }

        public Criteria andLanguageSituationIsNotNull() {
            addCriterion("LANGUAGE_SITUATION is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageSituationEqualTo(String value) {
            addCriterion("LANGUAGE_SITUATION =", value, "languageSituation");
            return (Criteria) this;
        }

        public Criteria andLanguageSituationNotEqualTo(String value) {
            addCriterion("LANGUAGE_SITUATION <>", value, "languageSituation");
            return (Criteria) this;
        }

        public Criteria andLanguageSituationGreaterThan(String value) {
            addCriterion("LANGUAGE_SITUATION >", value, "languageSituation");
            return (Criteria) this;
        }

        public Criteria andLanguageSituationGreaterThanOrEqualTo(String value) {
            addCriterion("LANGUAGE_SITUATION >=", value, "languageSituation");
            return (Criteria) this;
        }

        public Criteria andLanguageSituationLessThan(String value) {
            addCriterion("LANGUAGE_SITUATION <", value, "languageSituation");
            return (Criteria) this;
        }

        public Criteria andLanguageSituationLessThanOrEqualTo(String value) {
            addCriterion("LANGUAGE_SITUATION <=", value, "languageSituation");
            return (Criteria) this;
        }

        public Criteria andLanguageSituationLike(String value) {
            addCriterion("LANGUAGE_SITUATION like", value, "languageSituation");
            return (Criteria) this;
        }

        public Criteria andLanguageSituationNotLike(String value) {
            addCriterion("LANGUAGE_SITUATION not like", value, "languageSituation");
            return (Criteria) this;
        }

        public Criteria andLanguageSituationIn(List<String> values) {
            addCriterion("LANGUAGE_SITUATION in", values, "languageSituation");
            return (Criteria) this;
        }

        public Criteria andLanguageSituationNotIn(List<String> values) {
            addCriterion("LANGUAGE_SITUATION not in", values, "languageSituation");
            return (Criteria) this;
        }

        public Criteria andLanguageSituationBetween(String value1, String value2) {
            addCriterion("LANGUAGE_SITUATION between", value1, value2, "languageSituation");
            return (Criteria) this;
        }

        public Criteria andLanguageSituationNotBetween(String value1, String value2) {
            addCriterion("LANGUAGE_SITUATION not between", value1, value2, "languageSituation");
            return (Criteria) this;
        }

        public Criteria andProfessionalSkillsIsNull() {
            addCriterion("PROFESSIONAL_SKILLS is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalSkillsIsNotNull() {
            addCriterion("PROFESSIONAL_SKILLS is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalSkillsEqualTo(String value) {
            addCriterion("PROFESSIONAL_SKILLS =", value, "professionalSkills");
            return (Criteria) this;
        }

        public Criteria andProfessionalSkillsNotEqualTo(String value) {
            addCriterion("PROFESSIONAL_SKILLS <>", value, "professionalSkills");
            return (Criteria) this;
        }

        public Criteria andProfessionalSkillsGreaterThan(String value) {
            addCriterion("PROFESSIONAL_SKILLS >", value, "professionalSkills");
            return (Criteria) this;
        }

        public Criteria andProfessionalSkillsGreaterThanOrEqualTo(String value) {
            addCriterion("PROFESSIONAL_SKILLS >=", value, "professionalSkills");
            return (Criteria) this;
        }

        public Criteria andProfessionalSkillsLessThan(String value) {
            addCriterion("PROFESSIONAL_SKILLS <", value, "professionalSkills");
            return (Criteria) this;
        }

        public Criteria andProfessionalSkillsLessThanOrEqualTo(String value) {
            addCriterion("PROFESSIONAL_SKILLS <=", value, "professionalSkills");
            return (Criteria) this;
        }

        public Criteria andProfessionalSkillsLike(String value) {
            addCriterion("PROFESSIONAL_SKILLS like", value, "professionalSkills");
            return (Criteria) this;
        }

        public Criteria andProfessionalSkillsNotLike(String value) {
            addCriterion("PROFESSIONAL_SKILLS not like", value, "professionalSkills");
            return (Criteria) this;
        }

        public Criteria andProfessionalSkillsIn(List<String> values) {
            addCriterion("PROFESSIONAL_SKILLS in", values, "professionalSkills");
            return (Criteria) this;
        }

        public Criteria andProfessionalSkillsNotIn(List<String> values) {
            addCriterion("PROFESSIONAL_SKILLS not in", values, "professionalSkills");
            return (Criteria) this;
        }

        public Criteria andProfessionalSkillsBetween(String value1, String value2) {
            addCriterion("PROFESSIONAL_SKILLS between", value1, value2, "professionalSkills");
            return (Criteria) this;
        }

        public Criteria andProfessionalSkillsNotBetween(String value1, String value2) {
            addCriterion("PROFESSIONAL_SKILLS not between", value1, value2, "professionalSkills");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("HOBBY is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("HOBBY is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("HOBBY =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("HOBBY <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("HOBBY >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("HOBBY >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("HOBBY <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("HOBBY <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("HOBBY like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("HOBBY not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("HOBBY in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("HOBBY not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("HOBBY between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("HOBBY not between", value1, value2, "hobby");
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