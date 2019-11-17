<#import "parts/common.ftl" as c>

<@c.page>

    <div class="row">
        <div class="col-sm">
            <#include "parts/testCaseEdit.ftl">
        </div>
        <div class="col-sm">
            <#include "parts/testCaseList.ftl">
        </div>
        <div class="col-sm">
                <#include "parts/testCaseView.ftl">
            </div>
    </div>

</@c.page>