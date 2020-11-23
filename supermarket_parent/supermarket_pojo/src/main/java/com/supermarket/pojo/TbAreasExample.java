package com.supermarket.pojo;


import java.util.ArrayList;
import java.util.List;

public class TbAreasExample {
    protected String orderByClause;
    protected boolean disinct;
    //准则集合
    protected List<Criteria> oredCriteria;

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDisinct() {
        return disinct;
    }

    public void setDisinct(boolean disinct) {
        this.disinct = disinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void setOredCriteria(List<Criteria> oredCriteria) {
        this.oredCriteria = oredCriteria;
    }


    public void or(Criteria criteria){
        oredCriteria.add(criteria);
    }

    public Criteria ro(){
        Criteria criteria=createCriteriaInternal();  //负责处理该对象
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria(){
        Criteria criteria=createCriteriaInternal();  //负责处理该对象
        if (oredCriteria.size()==0){
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    //负责生产对象
    protected Criteria createCriteriaInternal(){
        Criteria criteria=new Criteria();
        return criteria;
    }

    //清除
    public void clear(){
        oredCriteria.clear();
        orderByClause=null;
        disinct=false;
    }

    //抽象静态类产生criteria
    protected abstract static class GeneratedCriteria{
        protected List<Criterion> criteria;
        protected GeneratedCriteria(){
            super();
            criteria=new ArrayList<Criterion>();
        }

        public boolean isValid(){
            return criteria.size() > 0;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        public List<Criterion> getAllCriteria(){
            return criteria;
        }

        protected void addCriterion(String condition){
            if(condition==null){
                throw new RuntimeException("Value for condition cannot be null");  //条件值不能为空
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition,Object value,String property){
            if (value==null){
                throw new RuntimeException("value for"+property+"cannot be null");
            }
            criteria.add(new Criterion(condition,value));
        }

        protected void addCriterion(String condition,Object value1,Object value2,String  property){
            if(value1==null||value2==null){
                throw new RuntimeException("Between values for"+property+"cannot be null");
            }
            criteria.add(new Criterion(condition,value1,value2));
        }

        //等于空
        public Criteria andIdIsNull(){
            addCriterion("id is null");
            return (Criteria) this;
        }

        //不等于空
        public Criteria andIdIsNotNull(){
            addCriterion("id is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andIdEqualTo(Long value){
            addCriterion("id =",value,"id");
            return (Criteria) this;
        }

        //不等于
        public Criteria andIdNotEqualTo(Long value){
            addCriterion("id <>",value,"id");
            return (Criteria) this;
        }

        //大于
        public Criteria andIdGreaterThan(Long value){
            addCriterion("id >",value,"id");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andIdGreaterThanOrEqualTo(Long value){
            addCriterion("id >=",value,"id");
            return (Criteria) this;
        }

        //小于
        public Criteria andIdLessThan(Long value){
            addCriterion("id <",value,"id");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addIdLessThanOrEqualTo(Long value){
            addCriterion("id <=",value,"id");
            return (Criteria) this;
        }

        //id在里面
        public Criteria andIdIn(List<Long> values){
            addCriterion("id in",values,"id");
            return (Criteria) this;
        }

        //id不在里面
        public Criteria andIdNotIn(List<Long> values){
            addCriterion("id not in",values,"id");
            return (Criteria) this;
        }

        //id等于两个
        public Criteria andIdBetween(Long value1,Long value2){
            addCriterion("id between",value1,value2,"id");
            return (Criteria) this;
        }

        //id不等于两个
        public Criteria andIdNotBetween(Long value1,Long value2){
            addCriterion("id not between",value1,value2,"id");
            return (Criteria) this;
        }

        //------------------------------------------------------------areaid(省)
        //等于空
        public Criteria andAreaidIsNull(){
            addCriterion("areaid is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andAreaidIsNotNull(){
            addCriterion("areaid is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andAreaidEqualTo(String value){
            addCriterion("areaid =",value,"areaid");
            return (Criteria) this;
        }

        //不等于
        public Criteria andAreaidNotEqualTo(String value){
            addCriterion("areaid <>",value,"areaid");
            return (Criteria) this;
        }

        //大于
        public Criteria andAreaidGreaterThan(String value){
            addCriterion("areaid >",value,"areaid");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andAreaidGreaterThanEqualTo(String value){
            addCriterion("areaid >=",value,"areaid");
            return (Criteria) this;
        }

        //小于
        public Criteria andAreaidLessThan(String value){
            addCriterion("areaid <",value,"areaid");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addAreaidLessThanEqualTo(String value){
            addCriterion("areaid <=",value,"areaid");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andAreaidLike(String value){
            addCriterion("areaid like",value,"areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotLike(String value){
            addCriterion("areaid not like",value,"areaid");
            return (Criteria) this;
        }

        //两个值
        public Criteria andAreaidBetween(String value1,String value2){
            addCriterion("areaid between",value1,value2,"areaid");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andAreaidNotBetween(String value1,String value2){
            addCriterion("areaid not between",value1,value2,"areaid");
            return (Criteria) this;
        }


        public void setCriteria(List<Criterion> criteria) {
            this.criteria = criteria;
        }
    }


    public TbAreasExample() {
        oredCriteria=new ArrayList();
    }

    public static class Criteria extends GeneratedCriteria{    //criteria继承

        protected Criteria(){
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

        public void setCondition(String condition) {
            this.condition = condition;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public void setSecondValue(Object secondValue) {
            this.secondValue = secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public void setNoValue(boolean noValue) {
            this.noValue = noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public void setSingleValue(boolean singleValue) {
            this.singleValue = singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public void setBetweenValue(boolean betweenValue) {
            this.betweenValue = betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public void setListValue(boolean listValue) {
            this.listValue = listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        public void setTypeHandler(String typeHandler) {
            this.typeHandler = typeHandler;
        }

        protected Criterion(String condition){
            super();
            this.condition=condition;
            this.typeHandler=null;
            this.noValue=true;
        }

        protected Criterion(String condition, Object value,String typeHandler){
            super();
            this.condition=condition;
            this.value=value;
            this.typeHandler=typeHandler;
            if(value instanceof List<?>){
                this.listValue=true;        //如果满足条件就是一组数据
            }else {
                this.singleValue=true;      //否则就是一个数据
            }
        }


        protected Criterion(String condition,Object value){
            this(condition,value,null);
        }

        protected Criterion(String condition,Object value,Object secondValue,String typeHandler){
            super();
            this.condition=condition;
            this.value=value;
            this.secondValue=secondValue;
            this.typeHandler=typeHandler;
            this.betweenValue=true;
        }

        protected Criterion(String condition,Object value,Object secondValue){
            this(condition,value,secondValue,null);
        }

    }

}
