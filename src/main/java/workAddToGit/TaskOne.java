//package workAddToGit;
//
//public class TaskOne {
//    <select id="getNewTasks" resultMap="EmplRebuildProcess">
//        <![CDATA[
//    select
//    rtrim(ldap_login) as ldap_login,
//    dt_from,
//    max(dt_to) as dt_to,
//            null as proc_start,
//            null as proc_end,
//            proc_type,
//    rtrim(proc_etc) as proc_etc
//    from ts.tsproc
//    where proc_start is null
//    and proc_add < statement_timestamp()
//            ]]>
//    and proc_type in
//            <foreach item="type" index="index" collection="types" open="(" separator="," close=")">
//            #{type.rawValue}
//        </foreach>
//    group by rtrim(ldap_login), dt_from, proc_type, rtrim(proc_etc)
//    limit 1000
//    </select>
//
//}
