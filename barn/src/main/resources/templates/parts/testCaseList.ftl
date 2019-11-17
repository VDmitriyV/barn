<h5>Test case list</h5>

<ul class="list-group">

    <div class="list-group">
    <#list testCases as testCase>
        <a href="getTC?id=${testCase.id}" class="list-group-item list-group-item-action" id=${testCase.id}>${testCase.title}</a>
    <#else>
        <a href="#" class="list-group-item list-group-item-action disabled" tabindex="-1" aria-disabled="true">No items</a>
    </#list>
    </div>
</ul>

<!--<ul class="list-group">-->
<!--    <div class="list-group">-->
<!--        <#list testCases as testCase>-->
<!--        <button type="submit" class="list-group-item list-group-item-action" id=${testCase.id} action="getTC">${testCase.title}</button>-->
<!--        <#else>-->
<!--        <button type="button" class="list-group-item list-group-item-action">No items</button>-->
<!--    </#list>-->
<!--    </div>-->
<!--</ul>-->