package com.supermarket.pojo;


import java.util.ArrayList;
import java.util.List;

public class TbSpecificationOptionExample {
    //升序还是降序
    //参数格式：字段+空格+acs(desc)
    protected String orderByClause;
    //去除重复
    //true是选择不重复记录
    protected boolean distinct;
    //自定义查询条件
    //Criteria的集合，集合中对象由or连接
    protected List<Criteria> oredCriteria;

//    public String getOrderByClause() {
//        return orderByClause;
//    }
//
//    public void setOrderByClause(String orderByClause) {
//        this.orderByClause = orderByClause;
//    }
//
//    public boolean isdistinct() {
//        return distinct;
//    }
//
//    public void setdistinct(boolean distinct) {
//        this.distinct = distinct;
//    }
//
//    public List<Criteria> getOredCriteria() {
//        return oredCriteria;
//    }
//
//    public void setOredCriteria(List<Criteria> oredCriteria) {
//        this.oredCriteria = oredCriteria;
//    }


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
        distinct=false;
    }

    //是mybatis中逆向工程中的代码模型
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

        //------------------------------------------------------------option_name(选项名称)
        //等于空
        public Criteria andOptionNameIsNull(){
            addCriterion("option_name is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andOptionNameIsNotNull(){
            addCriterion("option_name is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andOptionNameEqualTo(String value){
            addCriterion("option_name =",value,"optionName");
            return (Criteria) this;
        }

        //不等于
        public Criteria andOptionNameNotEqualTo(String value){
            addCriterion("option_name <>",value,"optionName");
            return (Criteria) this;
        }

        //大于
        public Criteria andOptionNameGreaterThan(String value){
            addCriterion("option_name >",value,"optionName");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andOptionNameGreaterThanEqualTo(String value){
            addCriterion("option_name >=",value,"optionName");
            return (Criteria) this;
        }

        //小于
        public Criteria andOptionNameLessThan(String value){
            addCriterion("option_name <",value,"optionName");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addOptionNameLessThanEqualTo(String value){
            addCriterion("option_name <=",value,"optionName");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andOptionNameLike(String value){
            addCriterion("option_name like",value,"optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameNotLike(String value){
            addCriterion("option_name not like",value,"optionName");
            return (Criteria) this;
        }

        //两个值
        public Criteria andOptionNameBetween(String value1,String value2){
            addCriterion("option_name between",value1,value2,"optionName");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andOptionNameNotBetween(String value1,String value2){
            addCriterion("option_name not between",value1,value2,"optionName");
            return (Criteria) this;
        }

        //------------------------------------------------------------spec_id(规格id)
        //等于空
        public Criteria andSpecIdIsNull(){
            addCriterion("spec_id is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andSpecIdIsNotNull(){
            addCriterion("spec_id is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andSpecIdEqualTo(Long value){
            addCriterion("spec_id =",value,"specId");
            return (Criteria) this;
        }

        //不等于
        public Criteria andSpecIdNotEqualTo(Long value){
            addCriterion("spec_id <>",value,"specId");
            return (Criteria) this;
        }

        //大于
        public Criteria andSpecIdGreaterThan(Long value){
            addCriterion("spec_id >",value,"specId");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andSpecIdGreaterThanEqualTo(Long value){
            addCriterion("spec_id >=",value,"specId");
            return (Criteria) this;
        }

        //小于
        public Criteria andSpecIdLessThan(Long value){
            addCriterion("spec_id <",value,"specId");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addSpecIdLessThanEqualTo(Long value){
            addCriterion("spec_id <=",value,"specId");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andSpecIdLike(Long value){
            addCriterion("spec_id like",value,"specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdNotLike(Long value){
            addCriterion("spec_id not like",value,"specId");
            return (Criteria) this;
        }

        //两个值
        public Criteria andSpecIdBetween(Long value1,Long value2){
            addCriterion("spec_id between",value1,value2,"specId");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andSpecIdNotBetween(Long value1,String value2){
            addCriterion("spec_id not between",value1,value2,"specId");
            return (Criteria) this;
        }

        //------------------------------------------------------------orders(排序值)
        //等于空
        public Criteria andOrdersIsNull(){
            addCriterion("orders is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andOrdersIsNotNull(){
            addCriterion("orders is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andOrdersEqualTo(String value){
            addCriterion("orders =",value,"orders");
            return (Criteria) this;
        }

        //不等于
        public Criteria andOrdersNotEqualTo(String value){
            addCriterion("orders <>",value,"orders");
            return (Criteria) this;
        }

        //大于
        public Criteria andOrdersGreaterThan(String value){
            addCriterion("orders >",value,"orders");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andOrdersGreaterThanEqualTo(String value){
            addCriterion("orders >=",value,"orders");
            return (Criteria) this;
        }

        //小于
        public Criteria andOrdersLessThan(String value){
            addCriterion("orders <",value,"orders");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addOrdersLessThanEqualTo(String value){
            addCriterion("orders <=",value,"orders");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andOrdersLike(String value){
            addCriterion("orders like",value,"orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotLike(String value){
            addCriterion("orders not like",value,"orders");
            return (Criteria) this;
        }

        //两个值
        public Criteria andOrdersBetween(String value1,String value2){
            addCriterion("orders between",value1,value2,"orders");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andOrdersNotBetween(String value1,String value2){
            addCriterion("orders not between",value1,value2,"orders");
            return (Criteria) this;
        }


        public void setCriteria(List<Criterion> criteria) {
            this.criteria = criteria;
        }
    }


    public TbSpecificationOptionExample() {
        oredCriteria=new ArrayList();
    }


    //内部类Criteria包含一个Cretiron的集合
    //每一个Criteria对像内包含的Cretiron之间
    //是由AND连接的
    public static class Criteria extends GeneratedCriteria{

        protected Criteria(){
            super();
        }

    }

    //是最基本，最底层的Where条件，用于字段级的筛选
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
