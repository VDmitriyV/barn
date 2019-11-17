<#import "parts/common.ftl" as c>

<@c.page>


<a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
    Add new test suite
</a>
<div class="collapse" id="collapseExample">
    <div class="form-group mt-3">
        <form method="post" enctype="multipart/form-data">
            <div class="form-group">
                <input type="text" class="form-control" name="name" placeholder="Введите название тест сьюта" />
            </div>
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </form>
    </div>
</div>


<#list testSuites as testSuite>
<div class="card" style="width: 18rem;">
    <div class="card-body">
        <h5 class="card-title">${testSuite.name}</h5>
        <h6 class="card-subtitle mb-2 text-muted">${testSuite.author.username}</h6>
        <a href="/tcOfTestSuite?id=${testSuite.id}" class="card-link">Get cases</a>
        <a href="#" class="card-link">Run</a>
    </div>
</div>
<#else>
<div class="card" style="width: 18rem;">
    <div class="card-body">
        <h5 class="card-title">Empty</h5>
    </div>
</div>
</#list>

</@c.page>