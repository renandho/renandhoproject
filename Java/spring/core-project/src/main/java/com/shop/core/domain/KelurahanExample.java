package com.shop.core.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KelurahanExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
    public KelurahanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
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

        public Criteria andKelurahanCodeIsNull() {
            addCriterion("KEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andKelurahanCodeIsNotNull() {
            addCriterion("KEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andKelurahanCodeEqualTo(String value) {
            addCriterion("KEL_CODE =", value, "kelurahanCode");
            return (Criteria) this;
        }

        public Criteria andKelurahanCodeNotEqualTo(String value) {
            addCriterion("KEL_CODE <>", value, "kelurahanCode");
            return (Criteria) this;
        }

        public Criteria andKelurahanCodeGreaterThan(String value) {
            addCriterion("KEL_CODE >", value, "kelurahanCode");
            return (Criteria) this;
        }

        public Criteria andKelurahanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("KEL_CODE >=", value, "kelurahanCode");
            return (Criteria) this;
        }

        public Criteria andKelurahanCodeLessThan(String value) {
            addCriterion("KEL_CODE <", value, "kelurahanCode");
            return (Criteria) this;
        }

        public Criteria andKelurahanCodeLessThanOrEqualTo(String value) {
            addCriterion("KEL_CODE <=", value, "kelurahanCode");
            return (Criteria) this;
        }

        public Criteria andKelurahanCodeLike(String value) {
            addCriterion("KEL_CODE like", value, "kelurahanCode");
            return (Criteria) this;
        }

        public Criteria andKelurahanCodeNotLike(String value) {
            addCriterion("KEL_CODE not like", value, "kelurahanCode");
            return (Criteria) this;
        }

        public Criteria andKelurahanCodeIn(List<String> values) {
            addCriterion("KEL_CODE in", values, "kelurahanCode");
            return (Criteria) this;
        }

        public Criteria andKelurahanCodeNotIn(List<String> values) {
            addCriterion("KEL_CODE not in", values, "kelurahanCode");
            return (Criteria) this;
        }

        public Criteria andKelurahanCodeBetween(String value1, String value2) {
            addCriterion("KEL_CODE between", value1, value2, "kelurahanCode");
            return (Criteria) this;
        }

        public Criteria andKelurahanCodeNotBetween(String value1, String value2) {
            addCriterion("KEL_CODE not between", value1, value2, "kelurahanCode");
            return (Criteria) this;
        }

        public Criteria andKelurahanIsNull() {
            addCriterion("KELURAHAN is null");
            return (Criteria) this;
        }

        public Criteria andKelurahanIsNotNull() {
            addCriterion("KELURAHAN is not null");
            return (Criteria) this;
        }

        public Criteria andKelurahanEqualTo(String value) {
            addCriterion("KELURAHAN =", value, "kelurahan");
            return (Criteria) this;
        }

        public Criteria andKelurahanNotEqualTo(String value) {
            addCriterion("KELURAHAN <>", value, "kelurahan");
            return (Criteria) this;
        }

        public Criteria andKelurahanGreaterThan(String value) {
            addCriterion("KELURAHAN >", value, "kelurahan");
            return (Criteria) this;
        }

        public Criteria andKelurahanGreaterThanOrEqualTo(String value) {
            addCriterion("KELURAHAN >=", value, "kelurahan");
            return (Criteria) this;
        }

        public Criteria andKelurahanLessThan(String value) {
            addCriterion("KELURAHAN <", value, "kelurahan");
            return (Criteria) this;
        }

        public Criteria andKelurahanLessThanOrEqualTo(String value) {
            addCriterion("KELURAHAN <=", value, "kelurahan");
            return (Criteria) this;
        }

        public Criteria andKelurahanLike(String value) {
            addCriterion("KELURAHAN like", value, "kelurahan");
            return (Criteria) this;
        }

        public Criteria andKelurahanNotLike(String value) {
            addCriterion("KELURAHAN not like", value, "kelurahan");
            return (Criteria) this;
        }

        public Criteria andKelurahanIn(List<String> values) {
            addCriterion("KELURAHAN in", values, "kelurahan");
            return (Criteria) this;
        }

        public Criteria andKelurahanNotIn(List<String> values) {
            addCriterion("KELURAHAN not in", values, "kelurahan");
            return (Criteria) this;
        }

        public Criteria andKelurahanBetween(String value1, String value2) {
            addCriterion("KELURAHAN between", value1, value2, "kelurahan");
            return (Criteria) this;
        }

        public Criteria andKelurahanNotBetween(String value1, String value2) {
            addCriterion("KELURAHAN not between", value1, value2, "kelurahan");
            return (Criteria) this;
        }

        public Criteria andKecCodeIsNull() {
            addCriterion("KEC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andKecCodeIsNotNull() {
            addCriterion("KEC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andKecCodeEqualTo(String value) {
            addCriterion("KEC_CODE =", value, "kecCode");
            return (Criteria) this;
        }

        public Criteria andKecCodeNotEqualTo(String value) {
            addCriterion("KEC_CODE <>", value, "kecCode");
            return (Criteria) this;
        }

        public Criteria andKecCodeGreaterThan(String value) {
            addCriterion("KEC_CODE >", value, "kecCode");
            return (Criteria) this;
        }

        public Criteria andKecCodeGreaterThanOrEqualTo(String value) {
            addCriterion("KEC_CODE >=", value, "kecCode");
            return (Criteria) this;
        }

        public Criteria andKecCodeLessThan(String value) {
            addCriterion("KEC_CODE <", value, "kecCode");
            return (Criteria) this;
        }

        public Criteria andKecCodeLessThanOrEqualTo(String value) {
            addCriterion("KEC_CODE <=", value, "kecCode");
            return (Criteria) this;
        }

        public Criteria andKecCodeLike(String value) {
            addCriterion("KEC_CODE like", value, "kecCode");
            return (Criteria) this;
        }

        public Criteria andKecCodeNotLike(String value) {
            addCriterion("KEC_CODE not like", value, "kecCode");
            return (Criteria) this;
        }

        public Criteria andKecCodeIn(List<String> values) {
            addCriterion("KEC_CODE in", values, "kecCode");
            return (Criteria) this;
        }

        public Criteria andKecCodeNotIn(List<String> values) {
            addCriterion("KEC_CODE not in", values, "kecCode");
            return (Criteria) this;
        }

        public Criteria andKecCodeBetween(String value1, String value2) {
            addCriterion("KEC_CODE between", value1, value2, "kecCode");
            return (Criteria) this;
        }

        public Criteria andKecCodeNotBetween(String value1, String value2) {
            addCriterion("KEC_CODE not between", value1, value2, "kecCode");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("UPDATE_BY =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("UPDATE_BY <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("UPDATE_BY >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("UPDATE_BY <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("UPDATE_BY like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("UPDATE_BY not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("UPDATE_BY in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("UPDATE_BY not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("UPDATE_BY between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andKelurahanCodeLikeInsensitive(String value) {
            addCriterion("upper(KEL_CODE) like", value.toUpperCase(), "kelurahanCode");
            return (Criteria) this;
        }

        public Criteria andKelurahanLikeInsensitive(String value) {
            addCriterion("upper(KELURAHAN) like", value.toUpperCase(), "kelurahan");
            return (Criteria) this;
        }

        public Criteria andKecCodeLikeInsensitive(String value) {
            addCriterion("upper(KEC_CODE) like", value.toUpperCase(), "kecCode");
            return (Criteria) this;
        }

        public Criteria andCreateByLikeInsensitive(String value) {
            addCriterion("upper(CREATE_BY) like", value.toUpperCase(), "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLikeInsensitive(String value) {
            addCriterion("upper(UPDATE_BY) like", value.toUpperCase(), "updateBy");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated do_not_delete_during_merge Thu Feb 28 18:40:22 ICT 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FS_MST_KELURAHAN_TEST
     *
     * @mbggenerated Thu Feb 28 18:40:22 ICT 2013
     */
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