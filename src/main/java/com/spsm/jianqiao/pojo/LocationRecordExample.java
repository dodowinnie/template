package com.spsm.jianqiao.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LocationRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LocationRecordExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTagNoIsNull() {
            addCriterion("tag_no is null");
            return (Criteria) this;
        }

        public Criteria andTagNoIsNotNull() {
            addCriterion("tag_no is not null");
            return (Criteria) this;
        }

        public Criteria andTagNoEqualTo(String value) {
            addCriterion("tag_no =", value, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoNotEqualTo(String value) {
            addCriterion("tag_no <>", value, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoGreaterThan(String value) {
            addCriterion("tag_no >", value, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoGreaterThanOrEqualTo(String value) {
            addCriterion("tag_no >=", value, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoLessThan(String value) {
            addCriterion("tag_no <", value, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoLessThanOrEqualTo(String value) {
            addCriterion("tag_no <=", value, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoLike(String value) {
            addCriterion("tag_no like", value, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoNotLike(String value) {
            addCriterion("tag_no not like", value, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoIn(List<String> values) {
            addCriterion("tag_no in", values, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoNotIn(List<String> values) {
            addCriterion("tag_no not in", values, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoBetween(String value1, String value2) {
            addCriterion("tag_no between", value1, value2, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoNotBetween(String value1, String value2) {
            addCriterion("tag_no not between", value1, value2, "tagNo");
            return (Criteria) this;
        }

        public Criteria andAnchorNoIsNull() {
            addCriterion("anchor_no is null");
            return (Criteria) this;
        }

        public Criteria andAnchorNoIsNotNull() {
            addCriterion("anchor_no is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorNoEqualTo(String value) {
            addCriterion("anchor_no =", value, "anchorNo");
            return (Criteria) this;
        }

        public Criteria andAnchorNoNotEqualTo(String value) {
            addCriterion("anchor_no <>", value, "anchorNo");
            return (Criteria) this;
        }

        public Criteria andAnchorNoGreaterThan(String value) {
            addCriterion("anchor_no >", value, "anchorNo");
            return (Criteria) this;
        }

        public Criteria andAnchorNoGreaterThanOrEqualTo(String value) {
            addCriterion("anchor_no >=", value, "anchorNo");
            return (Criteria) this;
        }

        public Criteria andAnchorNoLessThan(String value) {
            addCriterion("anchor_no <", value, "anchorNo");
            return (Criteria) this;
        }

        public Criteria andAnchorNoLessThanOrEqualTo(String value) {
            addCriterion("anchor_no <=", value, "anchorNo");
            return (Criteria) this;
        }

        public Criteria andAnchorNoLike(String value) {
            addCriterion("anchor_no like", value, "anchorNo");
            return (Criteria) this;
        }

        public Criteria andAnchorNoNotLike(String value) {
            addCriterion("anchor_no not like", value, "anchorNo");
            return (Criteria) this;
        }

        public Criteria andAnchorNoIn(List<String> values) {
            addCriterion("anchor_no in", values, "anchorNo");
            return (Criteria) this;
        }

        public Criteria andAnchorNoNotIn(List<String> values) {
            addCriterion("anchor_no not in", values, "anchorNo");
            return (Criteria) this;
        }

        public Criteria andAnchorNoBetween(String value1, String value2) {
            addCriterion("anchor_no between", value1, value2, "anchorNo");
            return (Criteria) this;
        }

        public Criteria andAnchorNoNotBetween(String value1, String value2) {
            addCriterion("anchor_no not between", value1, value2, "anchorNo");
            return (Criteria) this;
        }

        public Criteria andPosXIsNull() {
            addCriterion("pos_x is null");
            return (Criteria) this;
        }

        public Criteria andPosXIsNotNull() {
            addCriterion("pos_x is not null");
            return (Criteria) this;
        }

        public Criteria andPosXEqualTo(BigDecimal value) {
            addCriterion("pos_x =", value, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXNotEqualTo(BigDecimal value) {
            addCriterion("pos_x <>", value, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXGreaterThan(BigDecimal value) {
            addCriterion("pos_x >", value, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_x >=", value, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXLessThan(BigDecimal value) {
            addCriterion("pos_x <", value, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_x <=", value, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXIn(List<BigDecimal> values) {
            addCriterion("pos_x in", values, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXNotIn(List<BigDecimal> values) {
            addCriterion("pos_x not in", values, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_x between", value1, value2, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_x not between", value1, value2, "posX");
            return (Criteria) this;
        }

        public Criteria andPosYIsNull() {
            addCriterion("pos_y is null");
            return (Criteria) this;
        }

        public Criteria andPosYIsNotNull() {
            addCriterion("pos_y is not null");
            return (Criteria) this;
        }

        public Criteria andPosYEqualTo(BigDecimal value) {
            addCriterion("pos_y =", value, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYNotEqualTo(BigDecimal value) {
            addCriterion("pos_y <>", value, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYGreaterThan(BigDecimal value) {
            addCriterion("pos_y >", value, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_y >=", value, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYLessThan(BigDecimal value) {
            addCriterion("pos_y <", value, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_y <=", value, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYIn(List<BigDecimal> values) {
            addCriterion("pos_y in", values, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYNotIn(List<BigDecimal> values) {
            addCriterion("pos_y not in", values, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_y between", value1, value2, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_y not between", value1, value2, "posY");
            return (Criteria) this;
        }

        public Criteria andPosZIsNull() {
            addCriterion("pos_z is null");
            return (Criteria) this;
        }

        public Criteria andPosZIsNotNull() {
            addCriterion("pos_z is not null");
            return (Criteria) this;
        }

        public Criteria andPosZEqualTo(BigDecimal value) {
            addCriterion("pos_z =", value, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZNotEqualTo(BigDecimal value) {
            addCriterion("pos_z <>", value, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZGreaterThan(BigDecimal value) {
            addCriterion("pos_z >", value, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_z >=", value, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZLessThan(BigDecimal value) {
            addCriterion("pos_z <", value, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_z <=", value, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZIn(List<BigDecimal> values) {
            addCriterion("pos_z in", values, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZNotIn(List<BigDecimal> values) {
            addCriterion("pos_z not in", values, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_z between", value1, value2, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_z not between", value1, value2, "posZ");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
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