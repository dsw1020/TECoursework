<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="Puppies!!!" />

<%@include file="common/header.jspf"%>

<h1>Puppies!!!</h1>

<table class="table">
    <tr>
        <th>Name</th>
        <th>Weight</th>
        <th>Gender</th>
        <th>Paper Trained?</th>
    </tr>
        <tr>
            <td>
                Example Name
            </td>
            <td>
                0 lbs
            </td>
            <td>
                Example
            </td>
            <td>
                Maybe
            </td>
        </tr>
</table>

<fieldset>
<legend>Add a new puppy</legend>
<c:url var="saveAction" value="puppies/save" />
<form class="form" action="${saveAction}" method="POST">
    <div class="form-group">
        <input type="text" class="form-control" name="name" placeholder="Name">
    </div>
    <div class="form-group">
        <input type="number" class="form-control" name="weight" placeholder="Weight">
    </div>
    <div class="checkbox">
        <label>
            <input type="radio" name="gender" value="Male"> Male
        </label>
        <label>
            <input type="radio" name="gender" value="Female"> Female
        </label>
    </div>
    <div class="checkbox">
        <label>
            <input type="checkbox" name="paperTrained" value="true"> Paper Trained</label>
    </div>
    <input class="btn btn-default" name="submit" value="Save Puppy!" type="submit" />
</form>
</fieldset>
<%@include file="common/footer.jspf"%>