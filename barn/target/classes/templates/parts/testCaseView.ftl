<h5>Test case view</h5>

<div class="card">
    <h5 class="card-header"><#if title??>${title}<#else>Test case title</#if></h5>
    <div class="card-body">
        <h5 class="card-title">Summary</h5>
        <p class="card-text"><#if summary??>${summary}<#else>Summary</#if></p>
        <p class="card-text"><#if author??>${author}<#else>Author</#if></p>
    </div>

</div>