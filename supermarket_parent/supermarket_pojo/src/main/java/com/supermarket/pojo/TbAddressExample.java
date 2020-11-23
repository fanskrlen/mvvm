package com.supermarket.pojo;


import java.util.ArrayList;
import java.util.List;

public class TbAddressExample {
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

        //-----------------------------------------------------------------
        //user等于空
        public Criteria andUserIdIsNull(){
            addCriterion("user_id is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //user不等于空
        public Criteria andUserIdIsNotNull(){
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andUserIdEqualTo(String value){
            addCriterion("user_id =",value,"userId");
            return (Criteria) this;
        }

        //不等于
        public Criteria andUserIdNotEqualTo(String value){
            addCriterion("user_id <>",value,"userId");
            return (Criteria) this;
        }

        //大于
        public Criteria andUserIdGreaterThan(String value){
            addCriterion("user_id >",value,"userId");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andUserIdGreaterThanEqualTo(String value){
            addCriterion("user_id >=",value,"userId");
            return (Criteria) this;
        }

        //小于
        public Criteria andUserIdLessThan(String value){
            addCriterion("user_id <",value,"userId");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addUserIdLessThanEqualTo(String value){
            addCriterion("user_id <=",value,"userId");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andUserIdLike(String value){
            addCriterion("user_id like",value,"userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value){
            addCriterion("user_id not like",value,"userId");
            return (Criteria) this;
        }

        //两个值
        public Criteria andUserIdBetween(String value1,String value2){
            addCriterion("user_id between",value1,value2,"userId");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andUserIdNotBetween(String value1,String value2){
            addCriterion("user_id not between",value1,value2,"userId");
            return (Criteria) this;
        }

        //------------------------------------------------------------provinceId(省)
        //等于空
        public Criteria andProvinceIdIsNull(){
            addCriterion("province_id is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andProvinceIdIsNotNull(){
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andProvinceIdEqualTo(String value){
            addCriterion("province_id =",value,"provinceId");
            return (Criteria) this;
        }

        //不等于
        public Criteria andProvinceIdNotEqualTo(String value){
            addCriterion("province_id <>",value,"provinceId");
            return (Criteria) this;
        }

        //大于
        public Criteria andProvinceIdGreaterThan(String value){
            addCriterion("province_id >",value,"provinceId");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andProvinceIdGreaterThanEqualTo(String value){
            addCriterion("province_id >=",value,"provinceId");
            return (Criteria) this;
        }

        //小于
        public Criteria andProvinceIdLessThan(String value){
            addCriterion("province_id <",value,"provinceId");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addProvinceIdLessThanEqualTo(String value){
            addCriterion("province_id <=",value,"provinceId");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andProvinceIdLike(String value){
            addCriterion("province_id like",value,"provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotLike(String value){
            addCriterion("province_id not like",value,"provinceId");
            return (Criteria) this;
        }

        //两个值
        public Criteria andProvinceIdBetween(String value1,String value2){
            addCriterion("province_id between",value1,value2,"provinceId");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andProvinceIdNotBetween(String value1,String value2){
            addCriterion("province_id not between",value1,value2,"provinceId");
            return (Criteria) this;
        }


        //------------------------------------------------------------cityId(城市，市)
        //等于空
        public Criteria andCityIdIsNull(){
            addCriterion("city_id is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andCityIdIsNotNull(){
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andCityIdEqualTo(String value){
            addCriterion("city_id =",value,"cityId");
            return (Criteria) this;
        }

        //不等于
        public Criteria andCityIdNotEqualTo(String value){
            addCriterion("city_id <>",value,"cityId");
            return (Criteria) this;
        }

        //大于
        public Criteria andCityIdGreaterThan(String value){
            addCriterion("city_id >",value,"cityId");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andCityIdGreaterThanEqualTo(String value){
            addCriterion("city_id >=",value,"cityId");
            return (Criteria) this;
        }

        //小于
        public Criteria andCityIdLessThan(String value){
            addCriterion("city_id <",value,"cityId");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addCityIdLessThanEqualTo(String value){
            addCriterion("city_id <=",value,"cityId");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andCityIdLike(String value){
            addCriterion("city_id like",value,"cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value){
            addCriterion("city_id not like",value,"cityId");
            return (Criteria) this;
        }

        //两个值
        public Criteria andCityIdBetween(String value1,String value2){
            addCriterion("city_id between",value1,value2,"cityId");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andCityIdNotBetween(String value1,String value2){
            addCriterion("city_id not between",value1,value2,"cityId");
            return (Criteria) this;
        }


        //------------------------------------------------------------mobile(手机)
        //等于空
        public Criteria andMobileIsNull(){
            addCriterion("mobile is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andMobileIsNotNull(){
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andMobileEqualTo(String value){
            addCriterion("mobile =",value,"mobile");
            return (Criteria) this;
        }

        //不等于
        public Criteria andMobileNotEqualTo(String value){
            addCriterion("mobile <>",value,"mobile");
            return (Criteria) this;
        }

        //大于
        public Criteria andMobileGreaterThan(String value){
            addCriterion("mobile >",value,"mobile");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andMobileGreaterThanEqualTo(String value){
            addCriterion("mobile >=",value,"mobile");
            return (Criteria) this;
        }

        //小于
        public Criteria andMobileLessThan(String value){
            addCriterion("mobile <",value,"mobile");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addMobileLessThanEqualTo(String value){
            addCriterion("mobile <=",value,"mobile");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andMobileLike(String value){
            addCriterion("mobile like",value,"mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value){
            addCriterion("mobile not like",value,"mobile");
            return (Criteria) this;
        }

        //两个值
        public Criteria andMobileBetween(String value1,String value2){
            addCriterion("mobile between",value1,value2,"mobile");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andMobileNotBetween(String value1,String value2){
            addCriterion("mobile not between",value1,value2,"mobile");
            return (Criteria) this;
        }

        //------------------------------------------------------------townId(县，区)
        //等于空
        public Criteria andTownIdIsNull(){
            addCriterion("town_id is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andTownIdIsNotNull(){
            addCriterion("town_id is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andTownIdEqualTo(String value){
            addCriterion("town_id =",value,"townId");
            return (Criteria) this;
        }

        //不等于
        public Criteria andTownIdNotEqualTo(String value){
            addCriterion("town_id <>",value,"townId");
            return (Criteria) this;
        }

        //大于
        public Criteria andTownIdGreaterThan(String value){
            addCriterion("town_id >",value,"townId");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andTownIdGreaterThanEqualTo(String value){
            addCriterion("town_id >=",value,"townId");
            return (Criteria) this;
        }

        //小于
        public Criteria andTownIdLessThan(String value){
            addCriterion("town_id <",value,"townId");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addTownIdLessThanEqualTo(String value){
            addCriterion("town_id <=",value,"townId");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andTownIdLike(String value){
            addCriterion("town_id like",value,"townId");
            return (Criteria) this;
        }

        public Criteria andTownIdNotLike(String value){
            addCriterion("town_id not like",value,"townId");
            return (Criteria) this;
        }

        //两个值
        public Criteria andTownIdBetween(String value1,String value2){
            addCriterion("town_id between",value1,value2,"townId");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andTownIdNotBetween(String value1,String value2){
            addCriterion("town_id not between",value1,value2,"townId");
            return (Criteria) this;
        }


        //------------------------------------------------------------address(地址)
        //等于空
        public Criteria andAddressIsNull(){
            addCriterion("address is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andAddressIsNotNull(){
            addCriterion("address is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andAddressEqualTo(String value){
            addCriterion("address =",value,"address");
            return (Criteria) this;
        }

        //不等于
        public Criteria andAddressNotEqualTo(String value){
            addCriterion("address <>",value,"address");
            return (Criteria) this;
        }

        //大于
        public Criteria andAddressGreaterThan(String value){
            addCriterion("address >",value,"address");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andAddressGreaterThanEqualTo(String value){
            addCriterion("address >=",value,"address");
            return (Criteria) this;
        }

        //小于
        public Criteria andAddressLessThan(String value){
            addCriterion("address <",value,"address");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addAddressLessThanEqualTo(String value){
            addCriterion("address <=",value,"address");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andAddressLike(String value){
            addCriterion("address like",value,"address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value){
            addCriterion("address not like",value,"address");
            return (Criteria) this;
        }

        //两个值
        public Criteria andAddressBetween(String value1,String value2){
            addCriterion("address between",value1,value2,"address");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andAddressNotBetween(String value1,String value2){
            addCriterion("address not between",value1,value2,"address");
            return (Criteria) this;
        }



        //------------------------------------------------------------Contact(联系人)
        //等于空
        public Criteria andContactIsNull(){
            addCriterion("contact is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andContactIsNotNull(){
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andContactEqualTo(String value){
            addCriterion("contact =",value,"contact");
            return (Criteria) this;
        }

        //不等于
        public Criteria andContactNotEqualTo(String value){
            addCriterion("contact <>",value,"contact");
            return (Criteria) this;
        }

        //大于
        public Criteria andContactGreaterThan(String value){
            addCriterion("contact >",value,"contact");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andContactGreaterThanEqualTo(String value){
            addCriterion("contact >=",value,"contact");
            return (Criteria) this;
        }

        //小于
        public Criteria andContactLessThan(String value){
            addCriterion("contact <",value,"contact");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addContactLessThanEqualTo(String value){
            addCriterion("contact <=",value,"contact");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andContactLike(String value){
            addCriterion("contact like",value,"contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value){
            addCriterion("contact not like",value,"contact");
            return (Criteria) this;
        }

        //两个值
        public Criteria andContactBetween(String value1,String value2){
            addCriterion("contact between",value1,value2,"contact");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andContactNotBetween(String value1,String value2){
            addCriterion("contact not between",value1,value2,"contact");
            return (Criteria) this;
        }



        //------------------------------------------------------------IsDefault(默认值)
        //等于空
        public Criteria andIsDefaultIsNull(){
            addCriterion("is_default is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andIsDefaultIsNotNull(){
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andIsDefaultEqualTo(String value){
            addCriterion("is_default =",value,"isDefault");
            return (Criteria) this;
        }

        //不等于
        public Criteria andIsDefaultNotEqualTo(String value){
            addCriterion("is_default <>",value,"isDefault");
            return (Criteria) this;
        }

        //大于
        public Criteria andIsDefaultGreaterThan(String value){
            addCriterion("is_default >",value,"isDefault");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andIsDefaultGreaterThanEqualTo(String value){
            addCriterion("is_default >=",value,"isDefault");
            return (Criteria) this;
        }

        //小于
        public Criteria andIsDefaultLessThan(String value){
            addCriterion("is_default <",value,"isDefault");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addIsDefaultLessThanEqualTo(String value){
            addCriterion("is_default <=",value,"isDefault");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andIsDefaultLike(String value){
            addCriterion("is_default like",value,"isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotLike(String value){
            addCriterion("is_default not like",value,"isDefault");
            return (Criteria) this;
        }

        //两个值
        public Criteria andIsDefaultBetween(String value1,String value2){
            addCriterion("is_default between",value1,value2,"isDefault");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andIsDefaultNotBetween(String value1,String value2){
            addCriterion("is_default not between",value1,value2,"isDefault");
            return (Criteria) this;
        }


        //------------------------------------------------------------notes(备注)
        //等于空
        public Criteria andNotesIsNull(){
            addCriterion("notes is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andNotesIsNotNull(){
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria anNotesEqualTo(String value){
            addCriterion("notes =",value,"notes");
            return (Criteria) this;
        }

        //不等于
        public Criteria andNotesNotEqualTo(String value){
            addCriterion("notes <>",value,"notes");
            return (Criteria) this;
        }

        //大于
        public Criteria andNotesGreaterThan(String value){
            addCriterion("notes >",value,"notes");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andNotesGreaterThanEqualTo(String value){
            addCriterion("notes >=",value,"notes");
            return (Criteria) this;
        }

        //小于
        public Criteria andNotesLessThan(String value){
            addCriterion("notes <",value,"notes");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addNotesLessThanEqualTo(String value){
            addCriterion("notes <=",value,"notes");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andNotesLike(String value){
            addCriterion("notes like",value,"notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value){
            addCriterion("notes not like",value,"notes");
            return (Criteria) this;
        }

        //两个值
        public Criteria andNotesBetween(String value1,String value2){
            addCriterion("notes between",value1,value2,"notes");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andNotesNotBetween(String value1,String value2){
            addCriterion("notes not between",value1,value2,"notes");
            return (Criteria) this;
        }



        //------------------------------------------------------------CreateDate(创建日期)
        //等于空
        public Criteria andCreateDateIsNull(){
            addCriterion("create_date is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andCreateDateIsNotNull(){
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria anCreateDateEqualTo(String value){
            addCriterion("create_date =",value,"create_date");
            return (Criteria) this;
        }

        //不等于
        public Criteria andCreateDateNotEqualTo(String value){
            addCriterion("create_date <>",value,"create_date");
            return (Criteria) this;
        }

        //大于
        public Criteria andCreateDateGreaterThan(String value){
            addCriterion("create_date >",value,"create_date");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andCreateDateGreaterThanEqualTo(String value){
            addCriterion("create_date >=",value,"create_date");
            return (Criteria) this;
        }

        //小于
        public Criteria andCreateDateLessThan(String value){
            addCriterion("create_date <",value,"create_date");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addCreateDateLessThanEqualTo(String value){
            addCriterion("create_date <=",value,"create_date");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andCreateDateLike(String value){
            addCriterion("create_date like",value,"create_date");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value){
            addCriterion("create_date not like",value,"create_date");
            return (Criteria) this;
        }

        //两个值
        public Criteria andCreateDateBetween(String value1,String value2){
            addCriterion("create_date between",value1,value2,"create_date");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andCreateDateNotBetween(String value1,String value2){
            addCriterion("create_date not between",value1,value2,"create_date");
            return (Criteria) this;
        }


        //------------------------------------------------------------Alias(创建日期)
        //等于空
        public Criteria andAliasIsNull(){
            addCriterion("alias is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andAliasIsNotNull(){
            addCriterion("alias is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria anAliasEqualTo(String value){
            addCriterion("alias =",value,"alias");
            return (Criteria) this;
        }

        //不等于
        public Criteria andAliasNotEqualTo(String value){
            addCriterion("alias <>",value,"alias");
            return (Criteria) this;
        }

        //大于
        public Criteria andAliasGreaterThan(String value){
            addCriterion("alias >",value,"alias");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andAliasGreaterThanEqualTo(String value){
            addCriterion("alias >=",value,"alias");
            return (Criteria) this;
        }

        //小于
        public Criteria andAliasLessThan(String value){
            addCriterion("alias <",value,"alias");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addAliasLessThanEqualTo(String value){
            addCriterion("alias <=",value,"alias");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andAliasLike(String value){
            addCriterion("alias like",value,"alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value){
            addCriterion("alias not like",value,"alias");
            return (Criteria) this;
        }

        //两个值
        public Criteria andAliasBetween(String value1,String value2){
            addCriterion("alias between",value1,value2,"alias");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andAliasNotBetween(String value1,String value2){
            addCriterion("alias not between",value1,value2,"alias");
            return (Criteria) this;
        }






        public void setCriteria(List<Criterion> criteria) {
            this.criteria = criteria;
        }
    }


    public TbAddressExample() {
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
