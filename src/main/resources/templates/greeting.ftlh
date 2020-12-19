<#import "parts/common.ftlh" as c>

<@c.page>
    <#if user??>
    <h5>Hello ,${name}</h5>
    </#if>
    <div>This is a simple clone off Twitter</div>
</@c.page>