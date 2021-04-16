package com.deluxHotel.DeluxHotelMS.bean;

import java.util.ArrayList;
import java.util.List;

public class FacilityServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FacilityServiceExample() {
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

        public Criteria andFacilityServiceIdIsNull() {
            addCriterion("facility_service_id is null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceIdIsNotNull() {
            addCriterion("facility_service_id is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceIdEqualTo(Integer value) {
            addCriterion("facility_service_id =", value, "facilityServiceId");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceIdNotEqualTo(Integer value) {
            addCriterion("facility_service_id <>", value, "facilityServiceId");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceIdGreaterThan(Integer value) {
            addCriterion("facility_service_id >", value, "facilityServiceId");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("facility_service_id >=", value, "facilityServiceId");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceIdLessThan(Integer value) {
            addCriterion("facility_service_id <", value, "facilityServiceId");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("facility_service_id <=", value, "facilityServiceId");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceIdIn(List<Integer> values) {
            addCriterion("facility_service_id in", values, "facilityServiceId");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceIdNotIn(List<Integer> values) {
            addCriterion("facility_service_id not in", values, "facilityServiceId");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceIdBetween(Integer value1, Integer value2) {
            addCriterion("facility_service_id between", value1, value2, "facilityServiceId");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("facility_service_id not between", value1, value2, "facilityServiceId");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedTypeIsNull() {
            addCriterion("facility_service_bed_type is null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedTypeIsNotNull() {
            addCriterion("facility_service_bed_type is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedTypeEqualTo(String value) {
            addCriterion("facility_service_bed_type =", value, "facilityServiceBedType");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedTypeNotEqualTo(String value) {
            addCriterion("facility_service_bed_type <>", value, "facilityServiceBedType");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedTypeGreaterThan(String value) {
            addCriterion("facility_service_bed_type >", value, "facilityServiceBedType");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedTypeGreaterThanOrEqualTo(String value) {
            addCriterion("facility_service_bed_type >=", value, "facilityServiceBedType");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedTypeLessThan(String value) {
            addCriterion("facility_service_bed_type <", value, "facilityServiceBedType");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedTypeLessThanOrEqualTo(String value) {
            addCriterion("facility_service_bed_type <=", value, "facilityServiceBedType");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedTypeLike(String value) {
            addCriterion("facility_service_bed_type like", value, "facilityServiceBedType");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedTypeNotLike(String value) {
            addCriterion("facility_service_bed_type not like", value, "facilityServiceBedType");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedTypeIn(List<String> values) {
            addCriterion("facility_service_bed_type in", values, "facilityServiceBedType");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedTypeNotIn(List<String> values) {
            addCriterion("facility_service_bed_type not in", values, "facilityServiceBedType");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedTypeBetween(String value1, String value2) {
            addCriterion("facility_service_bed_type between", value1, value2, "facilityServiceBedType");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedTypeNotBetween(String value1, String value2) {
            addCriterion("facility_service_bed_type not between", value1, value2, "facilityServiceBedType");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedNumberIsNull() {
            addCriterion("facility_service_bed_number is null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedNumberIsNotNull() {
            addCriterion("facility_service_bed_number is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedNumberEqualTo(String value) {
            addCriterion("facility_service_bed_number =", value, "facilityServiceBedNumber");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedNumberNotEqualTo(String value) {
            addCriterion("facility_service_bed_number <>", value, "facilityServiceBedNumber");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedNumberGreaterThan(String value) {
            addCriterion("facility_service_bed_number >", value, "facilityServiceBedNumber");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedNumberGreaterThanOrEqualTo(String value) {
            addCriterion("facility_service_bed_number >=", value, "facilityServiceBedNumber");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedNumberLessThan(String value) {
            addCriterion("facility_service_bed_number <", value, "facilityServiceBedNumber");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedNumberLessThanOrEqualTo(String value) {
            addCriterion("facility_service_bed_number <=", value, "facilityServiceBedNumber");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedNumberLike(String value) {
            addCriterion("facility_service_bed_number like", value, "facilityServiceBedNumber");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedNumberNotLike(String value) {
            addCriterion("facility_service_bed_number not like", value, "facilityServiceBedNumber");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedNumberIn(List<String> values) {
            addCriterion("facility_service_bed_number in", values, "facilityServiceBedNumber");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedNumberNotIn(List<String> values) {
            addCriterion("facility_service_bed_number not in", values, "facilityServiceBedNumber");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedNumberBetween(String value1, String value2) {
            addCriterion("facility_service_bed_number between", value1, value2, "facilityServiceBedNumber");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBedNumberNotBetween(String value1, String value2) {
            addCriterion("facility_service_bed_number not between", value1, value2, "facilityServiceBedNumber");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceWifiIsNull() {
            addCriterion("facility_service_wifi is null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceWifiIsNotNull() {
            addCriterion("facility_service_wifi is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceWifiEqualTo(String value) {
            addCriterion("facility_service_wifi =", value, "facilityServiceWifi");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceWifiNotEqualTo(String value) {
            addCriterion("facility_service_wifi <>", value, "facilityServiceWifi");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceWifiGreaterThan(String value) {
            addCriterion("facility_service_wifi >", value, "facilityServiceWifi");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceWifiGreaterThanOrEqualTo(String value) {
            addCriterion("facility_service_wifi >=", value, "facilityServiceWifi");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceWifiLessThan(String value) {
            addCriterion("facility_service_wifi <", value, "facilityServiceWifi");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceWifiLessThanOrEqualTo(String value) {
            addCriterion("facility_service_wifi <=", value, "facilityServiceWifi");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceWifiLike(String value) {
            addCriterion("facility_service_wifi like", value, "facilityServiceWifi");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceWifiNotLike(String value) {
            addCriterion("facility_service_wifi not like", value, "facilityServiceWifi");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceWifiIn(List<String> values) {
            addCriterion("facility_service_wifi in", values, "facilityServiceWifi");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceWifiNotIn(List<String> values) {
            addCriterion("facility_service_wifi not in", values, "facilityServiceWifi");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceWifiBetween(String value1, String value2) {
            addCriterion("facility_service_wifi between", value1, value2, "facilityServiceWifi");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceWifiNotBetween(String value1, String value2) {
            addCriterion("facility_service_wifi not between", value1, value2, "facilityServiceWifi");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceRoomServiceIsNull() {
            addCriterion("facility_service_room_service is null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceRoomServiceIsNotNull() {
            addCriterion("facility_service_room_service is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceRoomServiceEqualTo(String value) {
            addCriterion("facility_service_room_service =", value, "facilityServiceRoomService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceRoomServiceNotEqualTo(String value) {
            addCriterion("facility_service_room_service <>", value, "facilityServiceRoomService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceRoomServiceGreaterThan(String value) {
            addCriterion("facility_service_room_service >", value, "facilityServiceRoomService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceRoomServiceGreaterThanOrEqualTo(String value) {
            addCriterion("facility_service_room_service >=", value, "facilityServiceRoomService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceRoomServiceLessThan(String value) {
            addCriterion("facility_service_room_service <", value, "facilityServiceRoomService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceRoomServiceLessThanOrEqualTo(String value) {
            addCriterion("facility_service_room_service <=", value, "facilityServiceRoomService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceRoomServiceLike(String value) {
            addCriterion("facility_service_room_service like", value, "facilityServiceRoomService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceRoomServiceNotLike(String value) {
            addCriterion("facility_service_room_service not like", value, "facilityServiceRoomService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceRoomServiceIn(List<String> values) {
            addCriterion("facility_service_room_service in", values, "facilityServiceRoomService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceRoomServiceNotIn(List<String> values) {
            addCriterion("facility_service_room_service not in", values, "facilityServiceRoomService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceRoomServiceBetween(String value1, String value2) {
            addCriterion("facility_service_room_service between", value1, value2, "facilityServiceRoomService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceRoomServiceNotBetween(String value1, String value2) {
            addCriterion("facility_service_room_service not between", value1, value2, "facilityServiceRoomService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBreakfastIsNull() {
            addCriterion("facility_service_breakfast is null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBreakfastIsNotNull() {
            addCriterion("facility_service_breakfast is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBreakfastEqualTo(String value) {
            addCriterion("facility_service_breakfast =", value, "facilityServiceBreakfast");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBreakfastNotEqualTo(String value) {
            addCriterion("facility_service_breakfast <>", value, "facilityServiceBreakfast");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBreakfastGreaterThan(String value) {
            addCriterion("facility_service_breakfast >", value, "facilityServiceBreakfast");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBreakfastGreaterThanOrEqualTo(String value) {
            addCriterion("facility_service_breakfast >=", value, "facilityServiceBreakfast");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBreakfastLessThan(String value) {
            addCriterion("facility_service_breakfast <", value, "facilityServiceBreakfast");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBreakfastLessThanOrEqualTo(String value) {
            addCriterion("facility_service_breakfast <=", value, "facilityServiceBreakfast");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBreakfastLike(String value) {
            addCriterion("facility_service_breakfast like", value, "facilityServiceBreakfast");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBreakfastNotLike(String value) {
            addCriterion("facility_service_breakfast not like", value, "facilityServiceBreakfast");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBreakfastIn(List<String> values) {
            addCriterion("facility_service_breakfast in", values, "facilityServiceBreakfast");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBreakfastNotIn(List<String> values) {
            addCriterion("facility_service_breakfast not in", values, "facilityServiceBreakfast");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBreakfastBetween(String value1, String value2) {
            addCriterion("facility_service_breakfast between", value1, value2, "facilityServiceBreakfast");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceBreakfastNotBetween(String value1, String value2) {
            addCriterion("facility_service_breakfast not between", value1, value2, "facilityServiceBreakfast");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceLaundryIsNull() {
            addCriterion("facility_service_laundry is null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceLaundryIsNotNull() {
            addCriterion("facility_service_laundry is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceLaundryEqualTo(String value) {
            addCriterion("facility_service_laundry =", value, "facilityServiceLaundry");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceLaundryNotEqualTo(String value) {
            addCriterion("facility_service_laundry <>", value, "facilityServiceLaundry");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceLaundryGreaterThan(String value) {
            addCriterion("facility_service_laundry >", value, "facilityServiceLaundry");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceLaundryGreaterThanOrEqualTo(String value) {
            addCriterion("facility_service_laundry >=", value, "facilityServiceLaundry");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceLaundryLessThan(String value) {
            addCriterion("facility_service_laundry <", value, "facilityServiceLaundry");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceLaundryLessThanOrEqualTo(String value) {
            addCriterion("facility_service_laundry <=", value, "facilityServiceLaundry");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceLaundryLike(String value) {
            addCriterion("facility_service_laundry like", value, "facilityServiceLaundry");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceLaundryNotLike(String value) {
            addCriterion("facility_service_laundry not like", value, "facilityServiceLaundry");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceLaundryIn(List<String> values) {
            addCriterion("facility_service_laundry in", values, "facilityServiceLaundry");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceLaundryNotIn(List<String> values) {
            addCriterion("facility_service_laundry not in", values, "facilityServiceLaundry");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceLaundryBetween(String value1, String value2) {
            addCriterion("facility_service_laundry between", value1, value2, "facilityServiceLaundry");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceLaundryNotBetween(String value1, String value2) {
            addCriterion("facility_service_laundry not between", value1, value2, "facilityServiceLaundry");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceTransferServiceIsNull() {
            addCriterion("facility_service_transfer_service is null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceTransferServiceIsNotNull() {
            addCriterion("facility_service_transfer_service is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceTransferServiceEqualTo(String value) {
            addCriterion("facility_service_transfer_service =", value, "facilityServiceTransferService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceTransferServiceNotEqualTo(String value) {
            addCriterion("facility_service_transfer_service <>", value, "facilityServiceTransferService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceTransferServiceGreaterThan(String value) {
            addCriterion("facility_service_transfer_service >", value, "facilityServiceTransferService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceTransferServiceGreaterThanOrEqualTo(String value) {
            addCriterion("facility_service_transfer_service >=", value, "facilityServiceTransferService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceTransferServiceLessThan(String value) {
            addCriterion("facility_service_transfer_service <", value, "facilityServiceTransferService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceTransferServiceLessThanOrEqualTo(String value) {
            addCriterion("facility_service_transfer_service <=", value, "facilityServiceTransferService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceTransferServiceLike(String value) {
            addCriterion("facility_service_transfer_service like", value, "facilityServiceTransferService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceTransferServiceNotLike(String value) {
            addCriterion("facility_service_transfer_service not like", value, "facilityServiceTransferService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceTransferServiceIn(List<String> values) {
            addCriterion("facility_service_transfer_service in", values, "facilityServiceTransferService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceTransferServiceNotIn(List<String> values) {
            addCriterion("facility_service_transfer_service not in", values, "facilityServiceTransferService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceTransferServiceBetween(String value1, String value2) {
            addCriterion("facility_service_transfer_service between", value1, value2, "facilityServiceTransferService");
            return (Criteria) this;
        }

        public Criteria andFacilityServiceTransferServiceNotBetween(String value1, String value2) {
            addCriterion("facility_service_transfer_service not between", value1, value2, "facilityServiceTransferService");
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