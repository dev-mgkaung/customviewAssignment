package mk.kotlin.customviewassignment.datas.dummys

import mk.kotlin.customviewassignment.datas.vos.PeopleEntity

fun getDummyPeopleList() : List<PeopleEntity> {
    var one = PeopleEntity()
    one.status  = "In progress"
    one. name  = "Design"
    one. title  = "Contact Page"
    one. messagecount  =20
    one. shareCount =10
    var two = PeopleEntity()
    two.status  = "Done"
    two. name  = "Design"
    two. title  = "Calculator Page"
    two. messagecount  =50
    two. shareCount =60
    var three = PeopleEntity()
    three.status  = "Review"
    three. name  = "Backend"
    three. title  = "HomePage"
    three. messagecount  =20
    three. shareCount =40
    var four = PeopleEntity()
    four.status  = "Done"
    four. name  = "Frondend"
    four. title  = "Login Page"
    four. messagecount  =30
    four. shareCount =40
    return arrayListOf(one,two,three,four)

}

