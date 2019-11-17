<#import "parts/common.ftl" as c>

<@c.page>

<#list testRuns as testRun>
<div class="card">
    <h5 class="card-header">${testRun.name}</h5>
    <div class="card-body">
        <div class="progress">
            <div class="progress-bar" role="progressbar" style="width: 15%" aria-valuenow="15" aria-valuemin="0" aria-valuemax="100"></div>
            <div class="progress-bar bg-success" role="progressbar" style="width: 30%" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100"></div>
            <div class="progress-bar bg-info" role="progressbar" style="width: 20%" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>
        </div>
        <a href="#" class="btn btn-primary">Open</a>
    </div>
</div>
</#list>

</@c.page>