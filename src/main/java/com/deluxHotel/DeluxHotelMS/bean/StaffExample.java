package com.deluxHotel.DeluxHotelMS.bean;

import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNull() {
            addCriterion("staff_sex is null");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNotNull() {
            addCriterion("staff_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSexEqualTo(String value) {
            addCriterion("staff_sex =", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotEqualTo(String value) {
            addCriterion("staff_sex <>", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThan(String value) {
            addCriterion("staff_sex >", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThanOrEqualTo(String value) {
            addCriterion("staff_sex >=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThan(String value) {
            addCriterion("staff_sex <", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThanOrEqualTo(String value) {
            addCriterion("staff_sex <=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLike(String value) {
            addCriterion("staff_sex like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotLike(String value) {
            addCriterion("staff_sex not like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexIn(List<String> values) {
            addCriterion("staff_sex in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotIn(List<String> values) {
            addCriterion("staff_sex not in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexBetween(String value1, String value2) {
            addCriterion("staff_sex between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotBetween(String value1, String value2) {
            addCriterion("staff_sex not between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardIsNull() {
            addCriterion("staff_idCard is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardIsNotNull() {
            addCriterion("staff_idCard is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardEqualTo(String value) {
            addCriterion("staff_idCard =", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardNotEqualTo(String value) {
            addCriterion("staff_idCard <>", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardGreaterThan(String value) {
            addCriterion("staff_idCard >", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("staff_idCard >=", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardLessThan(String value) {
            addCriterion("staff_idCard <", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardLessThanOrEqualTo(String value) {
            addCriterion("staff_idCard <=", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardLike(String value) {
            addCriterion("staff_idCard like", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardNotLike(String value) {
            addCriterion("staff_idCard not like", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardIn(List<String> values) {
            addCriterion("staff_idCard in", values, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardNotIn(List<String> values) {
            addCriterion("staff_idCard not in", values, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardBetween(String value1, String value2) {
            addCriterion("staff_idCard between", value1, value2, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardNotBetween(String value1, String value2) {
            addCriterion("staff_idCard not between", value1, value2, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffTelephoneIsNull() {
            addCriterion("staff_telephone is null");
            return (Criteria) this;
        }

        public Criteria andStaffTelephoneIsNotNull() {
            addCriterion("staff_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffTelephoneEqualTo(String value) {
            addCriterion("staff_telephone =", value, "staffTelephone");
            return (Criteria) this;
        }

        public Criteria andStaffTelephoneNotEqualTo(String value) {
            addCriterion("staff_telephone <>", value, "staffTelephone");
            return (Criteria) this;
        }

        public Criteria andStaffTelephoneGreaterThan(String value) {
            addCriterion("staff_telephone >", value, "staffTelephone");
            return (Criteria) this;
        }

        public Criteria andStaffTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("staff_telephone >=", value, "staffTelephone");
            return (Criteria) this;
        }

        public Criteria andStaffTelephoneLessThan(String value) {
            addCriterion("staff_telephone <", value, "staffTelephone");
            return (Criteria) this;
        }

        public Criteria andStaffTelephoneLessThanOrEqualTo(String value) {
            addCriterion("staff_telephone <=", value, "staffTelephone");
            return (Criteria) this;
        }

        public Criteria andStaffTelephoneLike(String value) {
            addCriterion("staff_telephone like", value, "staffTelephone");
            return (Criteria) this;
        }

        public Criteria andStaffTelephoneNotLike(String value) {
            addCriterion("staff_telephone not like", value, "staffTelephone");
            return (Criteria) this;
        }

        public Criteria andStaffTelephoneIn(List<String> values) {
            addCriterion("staff_telephone in", values, "staffTelephone");
            return (Criteria) this;
        }

        public Criteria andStaffTelephoneNotIn(List<String> values) {
            addCriterion("staff_telephone not in", values, "staffTelephone");
            return (Criteria) this;
        }

        public Criteria andStaffTelephoneBetween(String value1, String value2) {
            addCriterion("staff_telephone between", value1, value2, "staffTelephone");
            return (Criteria) this;
        }

        public Criteria andStaffTelephoneNotBetween(String value1, String value2) {
            addCriterion("staff_telephone not between", value1, value2, "staffTelephone");
            return (Criteria) this;
        }

        public Criteria andStaffEmailIsNull() {
            addCriterion("staff_Email is null");
            return (Criteria) this;
        }

        public Criteria andStaffEmailIsNotNull() {
            addCriterion("staff_Email is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEmailEqualTo(String value) {
            addCriterion("staff_Email =", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailNotEqualTo(String value) {
            addCriterion("staff_Email <>", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailGreaterThan(String value) {
            addCriterion("staff_Email >", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailGreaterThanOrEqualTo(String value) {
            addCriterion("staff_Email >=", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailLessThan(String value) {
            addCriterion("staff_Email <", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailLessThanOrEqualTo(String value) {
            addCriterion("staff_Email <=", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailLike(String value) {
            addCriterion("staff_Email like", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailNotLike(String value) {
            addCriterion("staff_Email not like", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailIn(List<String> values) {
            addCriterion("staff_Email in", values, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailNotIn(List<String> values) {
            addCriterion("staff_Email not in", values, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailBetween(String value1, String value2) {
            addCriterion("staff_Email between", value1, value2, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailNotBetween(String value1, String value2) {
            addCriterion("staff_Email not between", value1, value2, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordIsNull() {
            addCriterion("staff_password is null");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordIsNotNull() {
            addCriterion("staff_password is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordEqualTo(String value) {
            addCriterion("staff_password =", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordNotEqualTo(String value) {
            addCriterion("staff_password <>", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordGreaterThan(String value) {
            addCriterion("staff_password >", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("staff_password >=", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordLessThan(String value) {
            addCriterion("staff_password <", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordLessThanOrEqualTo(String value) {
            addCriterion("staff_password <=", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordLike(String value) {
            addCriterion("staff_password like", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordNotLike(String value) {
            addCriterion("staff_password not like", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordIn(List<String> values) {
            addCriterion("staff_password in", values, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordNotIn(List<String> values) {
            addCriterion("staff_password not in", values, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordBetween(String value1, String value2) {
            addCriterion("staff_password between", value1, value2, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordNotBetween(String value1, String value2) {
            addCriterion("staff_password not between", value1, value2, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffProfileIsNull() {
            addCriterion("staff_profile is null");
            return (Criteria) this;
        }

        public Criteria andStaffProfileIsNotNull() {
            addCriterion("staff_profile is not null");
            return (Criteria) this;
        }

        public Criteria andStaffProfileEqualTo(String value) {
            addCriterion("staff_profile =", value, "staffProfile");
            return (Criteria) this;
        }

        public Criteria andStaffProfileNotEqualTo(String value) {
            addCriterion("staff_profile <>", value, "staffProfile");
            return (Criteria) this;
        }

        public Criteria andStaffProfileGreaterThan(String value) {
            addCriterion("staff_profile >", value, "staffProfile");
            return (Criteria) this;
        }

        public Criteria andStaffProfileGreaterThanOrEqualTo(String value) {
            addCriterion("staff_profile >=", value, "staffProfile");
            return (Criteria) this;
        }

        public Criteria andStaffProfileLessThan(String value) {
            addCriterion("staff_profile <", value, "staffProfile");
            return (Criteria) this;
        }

        public Criteria andStaffProfileLessThanOrEqualTo(String value) {
            addCriterion("staff_profile <=", value, "staffProfile");
            return (Criteria) this;
        }

        public Criteria andStaffProfileLike(String value) {
            addCriterion("staff_profile like", value, "staffProfile");
            return (Criteria) this;
        }

        public Criteria andStaffProfileNotLike(String value) {
            addCriterion("staff_profile not like", value, "staffProfile");
            return (Criteria) this;
        }

        public Criteria andStaffProfileIn(List<String> values) {
            addCriterion("staff_profile in", values, "staffProfile");
            return (Criteria) this;
        }

        public Criteria andStaffProfileNotIn(List<String> values) {
            addCriterion("staff_profile not in", values, "staffProfile");
            return (Criteria) this;
        }

        public Criteria andStaffProfileBetween(String value1, String value2) {
            addCriterion("staff_profile between", value1, value2, "staffProfile");
            return (Criteria) this;
        }

        public Criteria andStaffProfileNotBetween(String value1, String value2) {
            addCriterion("staff_profile not between", value1, value2, "staffProfile");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityIsNull() {
            addCriterion("staff_authority is null");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityIsNotNull() {
            addCriterion("staff_authority is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityEqualTo(String value) {
            addCriterion("staff_authority =", value, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityNotEqualTo(String value) {
            addCriterion("staff_authority <>", value, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityGreaterThan(String value) {
            addCriterion("staff_authority >", value, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("staff_authority >=", value, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityLessThan(String value) {
            addCriterion("staff_authority <", value, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityLessThanOrEqualTo(String value) {
            addCriterion("staff_authority <=", value, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityLike(String value) {
            addCriterion("staff_authority like", value, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityNotLike(String value) {
            addCriterion("staff_authority not like", value, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityIn(List<String> values) {
            addCriterion("staff_authority in", values, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityNotIn(List<String> values) {
            addCriterion("staff_authority not in", values, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityBetween(String value1, String value2) {
            addCriterion("staff_authority between", value1, value2, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityNotBetween(String value1, String value2) {
            addCriterion("staff_authority not between", value1, value2, "staffAuthority");
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