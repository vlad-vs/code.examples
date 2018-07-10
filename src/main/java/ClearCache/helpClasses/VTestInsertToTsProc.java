//package com.pb.ts.master.tsproc;
//
//import org.joda.time.LocalDate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class VTestInsertToTsProc {
//    @Autowired
//    private RebuildProcessMapper rebuildProcessMapper;
//
//    public void setRebuildProcessMapper(RebuildProcessMapper rebuildProcessMapper) {
//        this.rebuildProcessMapper = rebuildProcessMapper;
//    }
//
//    public void sendTaskInTsProc (String nameTask){
//        EmplRebuildProcess rp = new EmplRebuildProcess();
//        rp.setLdapLogin(nameTask);
//        rp.setProcType(TsprocType.LDAP_LOGIN_CLEAR_CACHE);
//        rp.setDateFrom(LocalDate.now());
//        rp.setDateTo(LocalDate.now());
//        rebuildProcessMapper.insertIntoTSproc(rp);
//    }
//}
