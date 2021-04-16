package com.deluxHotel.DeluxHotelMS.bean;

import java.util.ArrayList;
import java.util.List;

public class RoomTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomTypeExample() {
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

        public Criteria andRoomTypeNumberIsNull() {
            addCriterion("room_type_number is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNumberIsNotNull() {
            addCriterion("room_type_number is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNumberEqualTo(String value) {
            addCriterion("room_type_number =", value, "roomTypeNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNumberNotEqualTo(String value) {
            addCriterion("room_type_number <>", value, "roomTypeNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNumberGreaterThan(String value) {
            addCriterion("room_type_number >", value, "roomTypeNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("room_type_number >=", value, "roomTypeNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNumberLessThan(String value) {
            addCriterion("room_type_number <", value, "roomTypeNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNumberLessThanOrEqualTo(String value) {
            addCriterion("room_type_number <=", value, "roomTypeNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNumberLike(String value) {
            addCriterion("room_type_number like", value, "roomTypeNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNumberNotLike(String value) {
            addCriterion("room_type_number not like", value, "roomTypeNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNumberIn(List<String> values) {
            addCriterion("room_type_number in", values, "roomTypeNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNumberNotIn(List<String> values) {
            addCriterion("room_type_number not in", values, "roomTypeNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNumberBetween(String value1, String value2) {
            addCriterion("room_type_number between", value1, value2, "roomTypeNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNumberNotBetween(String value1, String value2) {
            addCriterion("room_type_number not between", value1, value2, "roomTypeNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameIsNull() {
            addCriterion("room_type_name is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameIsNotNull() {
            addCriterion("room_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameEqualTo(String value) {
            addCriterion("room_type_name =", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotEqualTo(String value) {
            addCriterion("room_type_name <>", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameGreaterThan(String value) {
            addCriterion("room_type_name >", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("room_type_name >=", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameLessThan(String value) {
            addCriterion("room_type_name <", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameLessThanOrEqualTo(String value) {
            addCriterion("room_type_name <=", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameLike(String value) {
            addCriterion("room_type_name like", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotLike(String value) {
            addCriterion("room_type_name not like", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameIn(List<String> values) {
            addCriterion("room_type_name in", values, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotIn(List<String> values) {
            addCriterion("room_type_name not in", values, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameBetween(String value1, String value2) {
            addCriterion("room_type_name between", value1, value2, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotBetween(String value1, String value2) {
            addCriterion("room_type_name not between", value1, value2, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypePriceIsNull() {
            addCriterion("room_type_price is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypePriceIsNotNull() {
            addCriterion("room_type_price is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypePriceEqualTo(String value) {
            addCriterion("room_type_price =", value, "roomTypePrice");
            return (Criteria) this;
        }

        public Criteria andRoomTypePriceNotEqualTo(String value) {
            addCriterion("room_type_price <>", value, "roomTypePrice");
            return (Criteria) this;
        }

        public Criteria andRoomTypePriceGreaterThan(String value) {
            addCriterion("room_type_price >", value, "roomTypePrice");
            return (Criteria) this;
        }

        public Criteria andRoomTypePriceGreaterThanOrEqualTo(String value) {
            addCriterion("room_type_price >=", value, "roomTypePrice");
            return (Criteria) this;
        }

        public Criteria andRoomTypePriceLessThan(String value) {
            addCriterion("room_type_price <", value, "roomTypePrice");
            return (Criteria) this;
        }

        public Criteria andRoomTypePriceLessThanOrEqualTo(String value) {
            addCriterion("room_type_price <=", value, "roomTypePrice");
            return (Criteria) this;
        }

        public Criteria andRoomTypePriceLike(String value) {
            addCriterion("room_type_price like", value, "roomTypePrice");
            return (Criteria) this;
        }

        public Criteria andRoomTypePriceNotLike(String value) {
            addCriterion("room_type_price not like", value, "roomTypePrice");
            return (Criteria) this;
        }

        public Criteria andRoomTypePriceIn(List<String> values) {
            addCriterion("room_type_price in", values, "roomTypePrice");
            return (Criteria) this;
        }

        public Criteria andRoomTypePriceNotIn(List<String> values) {
            addCriterion("room_type_price not in", values, "roomTypePrice");
            return (Criteria) this;
        }

        public Criteria andRoomTypePriceBetween(String value1, String value2) {
            addCriterion("room_type_price between", value1, value2, "roomTypePrice");
            return (Criteria) this;
        }

        public Criteria andRoomTypePriceNotBetween(String value1, String value2) {
            addCriterion("room_type_price not between", value1, value2, "roomTypePrice");
            return (Criteria) this;
        }

        public Criteria andRoomTypeSizeIsNull() {
            addCriterion("room_type_size is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeSizeIsNotNull() {
            addCriterion("room_type_size is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeSizeEqualTo(String value) {
            addCriterion("room_type_size =", value, "roomTypeSize");
            return (Criteria) this;
        }

        public Criteria andRoomTypeSizeNotEqualTo(String value) {
            addCriterion("room_type_size <>", value, "roomTypeSize");
            return (Criteria) this;
        }

        public Criteria andRoomTypeSizeGreaterThan(String value) {
            addCriterion("room_type_size >", value, "roomTypeSize");
            return (Criteria) this;
        }

        public Criteria andRoomTypeSizeGreaterThanOrEqualTo(String value) {
            addCriterion("room_type_size >=", value, "roomTypeSize");
            return (Criteria) this;
        }

        public Criteria andRoomTypeSizeLessThan(String value) {
            addCriterion("room_type_size <", value, "roomTypeSize");
            return (Criteria) this;
        }

        public Criteria andRoomTypeSizeLessThanOrEqualTo(String value) {
            addCriterion("room_type_size <=", value, "roomTypeSize");
            return (Criteria) this;
        }

        public Criteria andRoomTypeSizeLike(String value) {
            addCriterion("room_type_size like", value, "roomTypeSize");
            return (Criteria) this;
        }

        public Criteria andRoomTypeSizeNotLike(String value) {
            addCriterion("room_type_size not like", value, "roomTypeSize");
            return (Criteria) this;
        }

        public Criteria andRoomTypeSizeIn(List<String> values) {
            addCriterion("room_type_size in", values, "roomTypeSize");
            return (Criteria) this;
        }

        public Criteria andRoomTypeSizeNotIn(List<String> values) {
            addCriterion("room_type_size not in", values, "roomTypeSize");
            return (Criteria) this;
        }

        public Criteria andRoomTypeSizeBetween(String value1, String value2) {
            addCriterion("room_type_size between", value1, value2, "roomTypeSize");
            return (Criteria) this;
        }

        public Criteria andRoomTypeSizeNotBetween(String value1, String value2) {
            addCriterion("room_type_size not between", value1, value2, "roomTypeSize");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAdultIsNull() {
            addCriterion("room_type_adult is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAdultIsNotNull() {
            addCriterion("room_type_adult is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAdultEqualTo(String value) {
            addCriterion("room_type_adult =", value, "roomTypeAdult");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAdultNotEqualTo(String value) {
            addCriterion("room_type_adult <>", value, "roomTypeAdult");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAdultGreaterThan(String value) {
            addCriterion("room_type_adult >", value, "roomTypeAdult");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAdultGreaterThanOrEqualTo(String value) {
            addCriterion("room_type_adult >=", value, "roomTypeAdult");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAdultLessThan(String value) {
            addCriterion("room_type_adult <", value, "roomTypeAdult");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAdultLessThanOrEqualTo(String value) {
            addCriterion("room_type_adult <=", value, "roomTypeAdult");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAdultLike(String value) {
            addCriterion("room_type_adult like", value, "roomTypeAdult");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAdultNotLike(String value) {
            addCriterion("room_type_adult not like", value, "roomTypeAdult");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAdultIn(List<String> values) {
            addCriterion("room_type_adult in", values, "roomTypeAdult");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAdultNotIn(List<String> values) {
            addCriterion("room_type_adult not in", values, "roomTypeAdult");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAdultBetween(String value1, String value2) {
            addCriterion("room_type_adult between", value1, value2, "roomTypeAdult");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAdultNotBetween(String value1, String value2) {
            addCriterion("room_type_adult not between", value1, value2, "roomTypeAdult");
            return (Criteria) this;
        }

        public Criteria andRoomTypeChildIsNull() {
            addCriterion("room_type_child is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeChildIsNotNull() {
            addCriterion("room_type_child is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeChildEqualTo(String value) {
            addCriterion("room_type_child =", value, "roomTypeChild");
            return (Criteria) this;
        }

        public Criteria andRoomTypeChildNotEqualTo(String value) {
            addCriterion("room_type_child <>", value, "roomTypeChild");
            return (Criteria) this;
        }

        public Criteria andRoomTypeChildGreaterThan(String value) {
            addCriterion("room_type_child >", value, "roomTypeChild");
            return (Criteria) this;
        }

        public Criteria andRoomTypeChildGreaterThanOrEqualTo(String value) {
            addCriterion("room_type_child >=", value, "roomTypeChild");
            return (Criteria) this;
        }

        public Criteria andRoomTypeChildLessThan(String value) {
            addCriterion("room_type_child <", value, "roomTypeChild");
            return (Criteria) this;
        }

        public Criteria andRoomTypeChildLessThanOrEqualTo(String value) {
            addCriterion("room_type_child <=", value, "roomTypeChild");
            return (Criteria) this;
        }

        public Criteria andRoomTypeChildLike(String value) {
            addCriterion("room_type_child like", value, "roomTypeChild");
            return (Criteria) this;
        }

        public Criteria andRoomTypeChildNotLike(String value) {
            addCriterion("room_type_child not like", value, "roomTypeChild");
            return (Criteria) this;
        }

        public Criteria andRoomTypeChildIn(List<String> values) {
            addCriterion("room_type_child in", values, "roomTypeChild");
            return (Criteria) this;
        }

        public Criteria andRoomTypeChildNotIn(List<String> values) {
            addCriterion("room_type_child not in", values, "roomTypeChild");
            return (Criteria) this;
        }

        public Criteria andRoomTypeChildBetween(String value1, String value2) {
            addCriterion("room_type_child between", value1, value2, "roomTypeChild");
            return (Criteria) this;
        }

        public Criteria andRoomTypeChildNotBetween(String value1, String value2) {
            addCriterion("room_type_child not between", value1, value2, "roomTypeChild");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAvailableNumberIsNull() {
            addCriterion("room_type_available_number is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAvailableNumberIsNotNull() {
            addCriterion("room_type_available_number is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAvailableNumberEqualTo(String value) {
            addCriterion("room_type_available_number =", value, "roomTypeAvailableNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAvailableNumberNotEqualTo(String value) {
            addCriterion("room_type_available_number <>", value, "roomTypeAvailableNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAvailableNumberGreaterThan(String value) {
            addCriterion("room_type_available_number >", value, "roomTypeAvailableNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAvailableNumberGreaterThanOrEqualTo(String value) {
            addCriterion("room_type_available_number >=", value, "roomTypeAvailableNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAvailableNumberLessThan(String value) {
            addCriterion("room_type_available_number <", value, "roomTypeAvailableNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAvailableNumberLessThanOrEqualTo(String value) {
            addCriterion("room_type_available_number <=", value, "roomTypeAvailableNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAvailableNumberLike(String value) {
            addCriterion("room_type_available_number like", value, "roomTypeAvailableNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAvailableNumberNotLike(String value) {
            addCriterion("room_type_available_number not like", value, "roomTypeAvailableNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAvailableNumberIn(List<String> values) {
            addCriterion("room_type_available_number in", values, "roomTypeAvailableNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAvailableNumberNotIn(List<String> values) {
            addCriterion("room_type_available_number not in", values, "roomTypeAvailableNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAvailableNumberBetween(String value1, String value2) {
            addCriterion("room_type_available_number between", value1, value2, "roomTypeAvailableNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeAvailableNumberNotBetween(String value1, String value2) {
            addCriterion("room_type_available_number not between", value1, value2, "roomTypeAvailableNumber");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIntrodutionIsNull() {
            addCriterion("room_type_introdution is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIntrodutionIsNotNull() {
            addCriterion("room_type_introdution is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIntrodutionEqualTo(String value) {
            addCriterion("room_type_introdution =", value, "roomTypeIntrodution");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIntrodutionNotEqualTo(String value) {
            addCriterion("room_type_introdution <>", value, "roomTypeIntrodution");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIntrodutionGreaterThan(String value) {
            addCriterion("room_type_introdution >", value, "roomTypeIntrodution");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIntrodutionGreaterThanOrEqualTo(String value) {
            addCriterion("room_type_introdution >=", value, "roomTypeIntrodution");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIntrodutionLessThan(String value) {
            addCriterion("room_type_introdution <", value, "roomTypeIntrodution");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIntrodutionLessThanOrEqualTo(String value) {
            addCriterion("room_type_introdution <=", value, "roomTypeIntrodution");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIntrodutionLike(String value) {
            addCriterion("room_type_introdution like", value, "roomTypeIntrodution");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIntrodutionNotLike(String value) {
            addCriterion("room_type_introdution not like", value, "roomTypeIntrodution");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIntrodutionIn(List<String> values) {
            addCriterion("room_type_introdution in", values, "roomTypeIntrodution");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIntrodutionNotIn(List<String> values) {
            addCriterion("room_type_introdution not in", values, "roomTypeIntrodution");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIntrodutionBetween(String value1, String value2) {
            addCriterion("room_type_introdution between", value1, value2, "roomTypeIntrodution");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIntrodutionNotBetween(String value1, String value2) {
            addCriterion("room_type_introdution not between", value1, value2, "roomTypeIntrodution");
            return (Criteria) this;
        }

        public Criteria andRoomTypePicIsNull() {
            addCriterion("room_type_pic is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypePicIsNotNull() {
            addCriterion("room_type_pic is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypePicEqualTo(String value) {
            addCriterion("room_type_pic =", value, "roomTypePic");
            return (Criteria) this;
        }

        public Criteria andRoomTypePicNotEqualTo(String value) {
            addCriterion("room_type_pic <>", value, "roomTypePic");
            return (Criteria) this;
        }

        public Criteria andRoomTypePicGreaterThan(String value) {
            addCriterion("room_type_pic >", value, "roomTypePic");
            return (Criteria) this;
        }

        public Criteria andRoomTypePicGreaterThanOrEqualTo(String value) {
            addCriterion("room_type_pic >=", value, "roomTypePic");
            return (Criteria) this;
        }

        public Criteria andRoomTypePicLessThan(String value) {
            addCriterion("room_type_pic <", value, "roomTypePic");
            return (Criteria) this;
        }

        public Criteria andRoomTypePicLessThanOrEqualTo(String value) {
            addCriterion("room_type_pic <=", value, "roomTypePic");
            return (Criteria) this;
        }

        public Criteria andRoomTypePicLike(String value) {
            addCriterion("room_type_pic like", value, "roomTypePic");
            return (Criteria) this;
        }

        public Criteria andRoomTypePicNotLike(String value) {
            addCriterion("room_type_pic not like", value, "roomTypePic");
            return (Criteria) this;
        }

        public Criteria andRoomTypePicIn(List<String> values) {
            addCriterion("room_type_pic in", values, "roomTypePic");
            return (Criteria) this;
        }

        public Criteria andRoomTypePicNotIn(List<String> values) {
            addCriterion("room_type_pic not in", values, "roomTypePic");
            return (Criteria) this;
        }

        public Criteria andRoomTypePicBetween(String value1, String value2) {
            addCriterion("room_type_pic between", value1, value2, "roomTypePic");
            return (Criteria) this;
        }

        public Criteria andRoomTypePicNotBetween(String value1, String value2) {
            addCriterion("room_type_pic not between", value1, value2, "roomTypePic");
            return (Criteria) this;
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