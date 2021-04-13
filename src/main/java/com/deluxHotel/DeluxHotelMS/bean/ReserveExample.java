package com.deluxHotel.DeluxHotelMS.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReserveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReserveExample() {
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

        public Criteria andReserveIdIsNull() {
            addCriterion("reserve_id is null");
            return (Criteria) this;
        }

        public Criteria andReserveIdIsNotNull() {
            addCriterion("reserve_id is not null");
            return (Criteria) this;
        }

        public Criteria andReserveIdEqualTo(Integer value) {
            addCriterion("reserve_id =", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdNotEqualTo(Integer value) {
            addCriterion("reserve_id <>", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdGreaterThan(Integer value) {
            addCriterion("reserve_id >", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reserve_id >=", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdLessThan(Integer value) {
            addCriterion("reserve_id <", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdLessThanOrEqualTo(Integer value) {
            addCriterion("reserve_id <=", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdIn(List<Integer> values) {
            addCriterion("reserve_id in", values, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdNotIn(List<Integer> values) {
            addCriterion("reserve_id not in", values, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdBetween(Integer value1, Integer value2) {
            addCriterion("reserve_id between", value1, value2, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reserve_id not between", value1, value2, "reserveId");
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

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andReservePaymentIsNull() {
            addCriterion("reserve_payment is null");
            return (Criteria) this;
        }

        public Criteria andReservePaymentIsNotNull() {
            addCriterion("reserve_payment is not null");
            return (Criteria) this;
        }

        public Criteria andReservePaymentEqualTo(String value) {
            addCriterion("reserve_payment =", value, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentNotEqualTo(String value) {
            addCriterion("reserve_payment <>", value, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentGreaterThan(String value) {
            addCriterion("reserve_payment >", value, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_payment >=", value, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentLessThan(String value) {
            addCriterion("reserve_payment <", value, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentLessThanOrEqualTo(String value) {
            addCriterion("reserve_payment <=", value, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentLike(String value) {
            addCriterion("reserve_payment like", value, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentNotLike(String value) {
            addCriterion("reserve_payment not like", value, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentIn(List<String> values) {
            addCriterion("reserve_payment in", values, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentNotIn(List<String> values) {
            addCriterion("reserve_payment not in", values, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentBetween(String value1, String value2) {
            addCriterion("reserve_payment between", value1, value2, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentNotBetween(String value1, String value2) {
            addCriterion("reserve_payment not between", value1, value2, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentStatusIsNull() {
            addCriterion("reserve_payment_status is null");
            return (Criteria) this;
        }

        public Criteria andReservePaymentStatusIsNotNull() {
            addCriterion("reserve_payment_status is not null");
            return (Criteria) this;
        }

        public Criteria andReservePaymentStatusEqualTo(String value) {
            addCriterion("reserve_payment_status =", value, "reservePaymentStatus");
            return (Criteria) this;
        }

        public Criteria andReservePaymentStatusNotEqualTo(String value) {
            addCriterion("reserve_payment_status <>", value, "reservePaymentStatus");
            return (Criteria) this;
        }

        public Criteria andReservePaymentStatusGreaterThan(String value) {
            addCriterion("reserve_payment_status >", value, "reservePaymentStatus");
            return (Criteria) this;
        }

        public Criteria andReservePaymentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_payment_status >=", value, "reservePaymentStatus");
            return (Criteria) this;
        }

        public Criteria andReservePaymentStatusLessThan(String value) {
            addCriterion("reserve_payment_status <", value, "reservePaymentStatus");
            return (Criteria) this;
        }

        public Criteria andReservePaymentStatusLessThanOrEqualTo(String value) {
            addCriterion("reserve_payment_status <=", value, "reservePaymentStatus");
            return (Criteria) this;
        }

        public Criteria andReservePaymentStatusLike(String value) {
            addCriterion("reserve_payment_status like", value, "reservePaymentStatus");
            return (Criteria) this;
        }

        public Criteria andReservePaymentStatusNotLike(String value) {
            addCriterion("reserve_payment_status not like", value, "reservePaymentStatus");
            return (Criteria) this;
        }

        public Criteria andReservePaymentStatusIn(List<String> values) {
            addCriterion("reserve_payment_status in", values, "reservePaymentStatus");
            return (Criteria) this;
        }

        public Criteria andReservePaymentStatusNotIn(List<String> values) {
            addCriterion("reserve_payment_status not in", values, "reservePaymentStatus");
            return (Criteria) this;
        }

        public Criteria andReservePaymentStatusBetween(String value1, String value2) {
            addCriterion("reserve_payment_status between", value1, value2, "reservePaymentStatus");
            return (Criteria) this;
        }

        public Criteria andReservePaymentStatusNotBetween(String value1, String value2) {
            addCriterion("reserve_payment_status not between", value1, value2, "reservePaymentStatus");
            return (Criteria) this;
        }

        public Criteria andReserveAdultIsNull() {
            addCriterion("reserve_adult is null");
            return (Criteria) this;
        }

        public Criteria andReserveAdultIsNotNull() {
            addCriterion("reserve_adult is not null");
            return (Criteria) this;
        }

        public Criteria andReserveAdultEqualTo(String value) {
            addCriterion("reserve_adult =", value, "reserveAdult");
            return (Criteria) this;
        }

        public Criteria andReserveAdultNotEqualTo(String value) {
            addCriterion("reserve_adult <>", value, "reserveAdult");
            return (Criteria) this;
        }

        public Criteria andReserveAdultGreaterThan(String value) {
            addCriterion("reserve_adult >", value, "reserveAdult");
            return (Criteria) this;
        }

        public Criteria andReserveAdultGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_adult >=", value, "reserveAdult");
            return (Criteria) this;
        }

        public Criteria andReserveAdultLessThan(String value) {
            addCriterion("reserve_adult <", value, "reserveAdult");
            return (Criteria) this;
        }

        public Criteria andReserveAdultLessThanOrEqualTo(String value) {
            addCriterion("reserve_adult <=", value, "reserveAdult");
            return (Criteria) this;
        }

        public Criteria andReserveAdultLike(String value) {
            addCriterion("reserve_adult like", value, "reserveAdult");
            return (Criteria) this;
        }

        public Criteria andReserveAdultNotLike(String value) {
            addCriterion("reserve_adult not like", value, "reserveAdult");
            return (Criteria) this;
        }

        public Criteria andReserveAdultIn(List<String> values) {
            addCriterion("reserve_adult in", values, "reserveAdult");
            return (Criteria) this;
        }

        public Criteria andReserveAdultNotIn(List<String> values) {
            addCriterion("reserve_adult not in", values, "reserveAdult");
            return (Criteria) this;
        }

        public Criteria andReserveAdultBetween(String value1, String value2) {
            addCriterion("reserve_adult between", value1, value2, "reserveAdult");
            return (Criteria) this;
        }

        public Criteria andReserveAdultNotBetween(String value1, String value2) {
            addCriterion("reserve_adult not between", value1, value2, "reserveAdult");
            return (Criteria) this;
        }

        public Criteria andReserveChildIsNull() {
            addCriterion("reserve_child is null");
            return (Criteria) this;
        }

        public Criteria andReserveChildIsNotNull() {
            addCriterion("reserve_child is not null");
            return (Criteria) this;
        }

        public Criteria andReserveChildEqualTo(String value) {
            addCriterion("reserve_child =", value, "reserveChild");
            return (Criteria) this;
        }

        public Criteria andReserveChildNotEqualTo(String value) {
            addCriterion("reserve_child <>", value, "reserveChild");
            return (Criteria) this;
        }

        public Criteria andReserveChildGreaterThan(String value) {
            addCriterion("reserve_child >", value, "reserveChild");
            return (Criteria) this;
        }

        public Criteria andReserveChildGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_child >=", value, "reserveChild");
            return (Criteria) this;
        }

        public Criteria andReserveChildLessThan(String value) {
            addCriterion("reserve_child <", value, "reserveChild");
            return (Criteria) this;
        }

        public Criteria andReserveChildLessThanOrEqualTo(String value) {
            addCriterion("reserve_child <=", value, "reserveChild");
            return (Criteria) this;
        }

        public Criteria andReserveChildLike(String value) {
            addCriterion("reserve_child like", value, "reserveChild");
            return (Criteria) this;
        }

        public Criteria andReserveChildNotLike(String value) {
            addCriterion("reserve_child not like", value, "reserveChild");
            return (Criteria) this;
        }

        public Criteria andReserveChildIn(List<String> values) {
            addCriterion("reserve_child in", values, "reserveChild");
            return (Criteria) this;
        }

        public Criteria andReserveChildNotIn(List<String> values) {
            addCriterion("reserve_child not in", values, "reserveChild");
            return (Criteria) this;
        }

        public Criteria andReserveChildBetween(String value1, String value2) {
            addCriterion("reserve_child between", value1, value2, "reserveChild");
            return (Criteria) this;
        }

        public Criteria andReserveChildNotBetween(String value1, String value2) {
            addCriterion("reserve_child not between", value1, value2, "reserveChild");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdIsNull() {
            addCriterion("room_type_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdIsNotNull() {
            addCriterion("room_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdEqualTo(Integer value) {
            addCriterion("room_type_id =", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdNotEqualTo(Integer value) {
            addCriterion("room_type_id <>", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdGreaterThan(Integer value) {
            addCriterion("room_type_id >", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_type_id >=", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdLessThan(Integer value) {
            addCriterion("room_type_id <", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_type_id <=", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdIn(List<Integer> values) {
            addCriterion("room_type_id in", values, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdNotIn(List<Integer> values) {
            addCriterion("room_type_id not in", values, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("room_type_id between", value1, value2, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_type_id not between", value1, value2, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andReserveRoomNumberIsNull() {
            addCriterion("reserve_room_number is null");
            return (Criteria) this;
        }

        public Criteria andReserveRoomNumberIsNotNull() {
            addCriterion("reserve_room_number is not null");
            return (Criteria) this;
        }

        public Criteria andReserveRoomNumberEqualTo(String value) {
            addCriterion("reserve_room_number =", value, "reserveRoomNumber");
            return (Criteria) this;
        }

        public Criteria andReserveRoomNumberNotEqualTo(String value) {
            addCriterion("reserve_room_number <>", value, "reserveRoomNumber");
            return (Criteria) this;
        }

        public Criteria andReserveRoomNumberGreaterThan(String value) {
            addCriterion("reserve_room_number >", value, "reserveRoomNumber");
            return (Criteria) this;
        }

        public Criteria andReserveRoomNumberGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_room_number >=", value, "reserveRoomNumber");
            return (Criteria) this;
        }

        public Criteria andReserveRoomNumberLessThan(String value) {
            addCriterion("reserve_room_number <", value, "reserveRoomNumber");
            return (Criteria) this;
        }

        public Criteria andReserveRoomNumberLessThanOrEqualTo(String value) {
            addCriterion("reserve_room_number <=", value, "reserveRoomNumber");
            return (Criteria) this;
        }

        public Criteria andReserveRoomNumberLike(String value) {
            addCriterion("reserve_room_number like", value, "reserveRoomNumber");
            return (Criteria) this;
        }

        public Criteria andReserveRoomNumberNotLike(String value) {
            addCriterion("reserve_room_number not like", value, "reserveRoomNumber");
            return (Criteria) this;
        }

        public Criteria andReserveRoomNumberIn(List<String> values) {
            addCriterion("reserve_room_number in", values, "reserveRoomNumber");
            return (Criteria) this;
        }

        public Criteria andReserveRoomNumberNotIn(List<String> values) {
            addCriterion("reserve_room_number not in", values, "reserveRoomNumber");
            return (Criteria) this;
        }

        public Criteria andReserveRoomNumberBetween(String value1, String value2) {
            addCriterion("reserve_room_number between", value1, value2, "reserveRoomNumber");
            return (Criteria) this;
        }

        public Criteria andReserveRoomNumberNotBetween(String value1, String value2) {
            addCriterion("reserve_room_number not between", value1, value2, "reserveRoomNumber");
            return (Criteria) this;
        }

        public Criteria andReserveCheckInTimeIsNull() {
            addCriterion("reserve_check_in_time is null");
            return (Criteria) this;
        }

        public Criteria andReserveCheckInTimeIsNotNull() {
            addCriterion("reserve_check_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andReserveCheckInTimeEqualTo(Date value) {
            addCriterion("reserve_check_in_time =", value, "reserveCheckInTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckInTimeNotEqualTo(Date value) {
            addCriterion("reserve_check_in_time <>", value, "reserveCheckInTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckInTimeGreaterThan(Date value) {
            addCriterion("reserve_check_in_time >", value, "reserveCheckInTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reserve_check_in_time >=", value, "reserveCheckInTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckInTimeLessThan(Date value) {
            addCriterion("reserve_check_in_time <", value, "reserveCheckInTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckInTimeLessThanOrEqualTo(Date value) {
            addCriterion("reserve_check_in_time <=", value, "reserveCheckInTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckInTimeIn(List<Date> values) {
            addCriterion("reserve_check_in_time in", values, "reserveCheckInTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckInTimeNotIn(List<Date> values) {
            addCriterion("reserve_check_in_time not in", values, "reserveCheckInTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckInTimeBetween(Date value1, Date value2) {
            addCriterion("reserve_check_in_time between", value1, value2, "reserveCheckInTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckInTimeNotBetween(Date value1, Date value2) {
            addCriterion("reserve_check_in_time not between", value1, value2, "reserveCheckInTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckOutTimeIsNull() {
            addCriterion("reserve_check_out_time is null");
            return (Criteria) this;
        }

        public Criteria andReserveCheckOutTimeIsNotNull() {
            addCriterion("reserve_check_out_time is not null");
            return (Criteria) this;
        }

        public Criteria andReserveCheckOutTimeEqualTo(Date value) {
            addCriterion("reserve_check_out_time =", value, "reserveCheckOutTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckOutTimeNotEqualTo(Date value) {
            addCriterion("reserve_check_out_time <>", value, "reserveCheckOutTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckOutTimeGreaterThan(Date value) {
            addCriterion("reserve_check_out_time >", value, "reserveCheckOutTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reserve_check_out_time >=", value, "reserveCheckOutTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckOutTimeLessThan(Date value) {
            addCriterion("reserve_check_out_time <", value, "reserveCheckOutTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("reserve_check_out_time <=", value, "reserveCheckOutTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckOutTimeIn(List<Date> values) {
            addCriterion("reserve_check_out_time in", values, "reserveCheckOutTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckOutTimeNotIn(List<Date> values) {
            addCriterion("reserve_check_out_time not in", values, "reserveCheckOutTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckOutTimeBetween(Date value1, Date value2) {
            addCriterion("reserve_check_out_time between", value1, value2, "reserveCheckOutTime");
            return (Criteria) this;
        }

        public Criteria andReserveCheckOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("reserve_check_out_time not between", value1, value2, "reserveCheckOutTime");
            return (Criteria) this;
        }

        public Criteria andReserveStatusIsNull() {
            addCriterion("reserve_status is null");
            return (Criteria) this;
        }

        public Criteria andReserveStatusIsNotNull() {
            addCriterion("reserve_status is not null");
            return (Criteria) this;
        }

        public Criteria andReserveStatusEqualTo(String value) {
            addCriterion("reserve_status =", value, "reserveStatus");
            return (Criteria) this;
        }

        public Criteria andReserveStatusNotEqualTo(String value) {
            addCriterion("reserve_status <>", value, "reserveStatus");
            return (Criteria) this;
        }

        public Criteria andReserveStatusGreaterThan(String value) {
            addCriterion("reserve_status >", value, "reserveStatus");
            return (Criteria) this;
        }

        public Criteria andReserveStatusGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_status >=", value, "reserveStatus");
            return (Criteria) this;
        }

        public Criteria andReserveStatusLessThan(String value) {
            addCriterion("reserve_status <", value, "reserveStatus");
            return (Criteria) this;
        }

        public Criteria andReserveStatusLessThanOrEqualTo(String value) {
            addCriterion("reserve_status <=", value, "reserveStatus");
            return (Criteria) this;
        }

        public Criteria andReserveStatusLike(String value) {
            addCriterion("reserve_status like", value, "reserveStatus");
            return (Criteria) this;
        }

        public Criteria andReserveStatusNotLike(String value) {
            addCriterion("reserve_status not like", value, "reserveStatus");
            return (Criteria) this;
        }

        public Criteria andReserveStatusIn(List<String> values) {
            addCriterion("reserve_status in", values, "reserveStatus");
            return (Criteria) this;
        }

        public Criteria andReserveStatusNotIn(List<String> values) {
            addCriterion("reserve_status not in", values, "reserveStatus");
            return (Criteria) this;
        }

        public Criteria andReserveStatusBetween(String value1, String value2) {
            addCriterion("reserve_status between", value1, value2, "reserveStatus");
            return (Criteria) this;
        }

        public Criteria andReserveStatusNotBetween(String value1, String value2) {
            addCriterion("reserve_status not between", value1, value2, "reserveStatus");
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