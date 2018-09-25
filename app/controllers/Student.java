package controllers;


import io.swagger.annotations.*;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

@Api(value = "student api",/*tags = "Student (Tag) API " ,*/description = "Student Api for testing purpose", position = 1)
public class Student extends Controller {

       public Result show(String id){
        return ok("Retrieved Student's Info");
    }

    @ApiOperation(
            value = "Create Student",nickname = "student", httpMethod = "POST", position = 1
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Student Id doesn't exist" ),
            @ApiResponse(code = 500, message = "System is down")})
/*    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "body", paramType = "body", dataType = "String", required = true,
                    examples = @io.swagger.annotations.Example(
                            value = {
                                    @ExampleProperty(value = "{'snapshot‘：{'type': 'AAA'}}")
                            })
    ),
    })*/
    @ApiImplicitParams(value = {
            @ApiImplicitParam(value = "student post api " , paramType = "body", dataType = "controllers.StudentReqModel", required = true
                    /*examples = @io.swagger.annotations.Example(
                            value = {
                                    @ExampleProperty(value = "{'ab':'123'}", mediaType = "controllers.StudentReqModel")
                            })*/
            ),
    })
    //@ApiModelProperty(value ="body1", name="Namebody1", dataType = "object", example =  "{'st‘：{'type': 'BBB'}}")

/*    @ApiImplicitParams({
            @ApiImplicitParam(
                    paramType = "body",
                    name = "myPody",
                    value = "my value pody",
                    dataType = "StudentReq")
    })*/
    //@BodyParser.Of(controllers.StudentReq.class)
    @BodyParser.Of(BodyParser.Json.class)
    public Result create(){
        StudentReqModel s = request().body().as(StudentReqModel.class);
        return ok("POST/Create Student Info");
    }

    public Result delete(String id){
        return ok("deleted Student's Info");
    }
    @ApiImplicitParams({
            @ApiImplicitParam(value = "Update Student's Info", required = true, dataType = "String", paramType = "body")
    })
    public Result update(String id){
        return ok("Updated Student's Info");
    }

}

@ApiModel
class StudentReq{

    @ApiModelProperty(value = "id")int id;
    @ApiModelProperty(value = "name")String name;
    @ApiModelProperty(value = "age")int age;
}