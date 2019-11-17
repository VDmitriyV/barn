<h5>Test case edit</h5>

<div class="form-group mt-3">

    <form method = "post" action="/main">
        <div class="form-group">
            <label for="nameInput">Testcase name</label>
            <input class="form-control" name="title" type="text" id="nameInput">
        </div>

        <div class="form-group">
            <label for="summaryId">Summary</label>
            <textarea class="form-control" name="summary" id="summaryId" rows="20"></textarea>
        </div>
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <button type="submit" class="btn btn-primary">Save</button>
    </form>


</div>