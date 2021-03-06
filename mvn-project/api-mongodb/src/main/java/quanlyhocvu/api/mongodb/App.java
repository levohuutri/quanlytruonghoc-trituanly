package quanlyhocvu.api.mongodb;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import quanlyhocvu.api.mongodb.DTO.Authority.UserDTO;
import quanlyhocvu.api.mongodb.DTO.Teacher.PhanCongDTO;
import quanlyhocvu.api.mongodb.DTO.base.HocSinhDTO;
import quanlyhocvu.api.mongodb.DTO.staff.CatalogNewsDTO;
import quanlyhocvu.api.mongodb.DTO.staff.LopHocDTO;

import quanlyhocvu.api.mongodb.service.MongoService;

class App {

    public static void main(String[] args) {

        ApplicationContext ctx = new GenericXmlApplicationContext(
//                "aopApplicationContext.xml",
                "noSqlApplicationContext.xml");
        MongoService mongoService = (MongoService) ctx.getBean("mongoService");
//        mongoService.insertCatalogNews(new CatalogNewsDTO("Học sinh","Thông tin học tập của học sinh"));
//        mongoService.insertCatalogNews(new CatalogNewsDTO("Giáo viên","Thông tin giảng dạy của giáo viên"));
//        mongoService.insertCatalogNews(new CatalogNewsDTO("Chi bộ","Thông tin hoạt động của chi bộ"));
//        mongoService.insertCatalogNews(new CatalogNewsDTO("Đoàn thanh niên","Thông tin đoàn thanh niên"));
//        mongoService.insertCatalogNews(new CatalogNewsDTO("Nhà trường", "Lịch công tác của nhà trường"));
//        

          int count = mongoService.getNewsByCatalogIdAndPage("52aab7888695f78d8c368abe", 10, 0).size();
          System.out.println(count);
//        List<UserDTO> users = mongoService.getUsersByRoleName("STAFF");
//        for (UserDTO user : users) {
//             System.out.println(user.getUsername());
//        }
////mongoService.generateAllUser();
//
//        PhanCongDTO phanCong = mongoService.getPhanCongById("52a37e9fa5d4a39519ae6a4e");
//        System.out.println(phanCong.getLopHoc().gettenLopHoc());
//        LopHocDTO lopHoc = phanCong.getLopHoc();
//        System.out.println(phanCong.getLopHoc().getlistHocSinh().size());
//        HocSinhDTO hocSinh = mongoService.getHocSinhLopHocById(lopHoc, "52a08ac344ae1b042422312c");
//        System.out.println(hocSinh.gethoTen());
////        PhanCongDTO pc = mongoService.getPhanCongById("52a37e9fa5d4a39519ae6a4e");
//        List<HocSinhDTO> l = mongoService.getAllStudents();
//        for(int i = 0; i < l.size(); i++) {
//            DiemDTO diem = new DiemDTO();
//            diem.setHocKy(1);
//            diem.setHocSinh(l.get(i));
//            diem.setPhanCong(pc);
//            mongoService.insertDiem(diem);
//        }
//        List<DiemDTO> l = mongoService.getAllDiem();
//        for(int  i = 0; i < l.size();i++) {
//            
//            mongoService.deleteDiem(l.get(i));
//        }
        
        //mongoService.generateAllUser();

        //mongoService.getAuthorityDAO().insertUserAccount("admin", "admin", null, Authorities.ADMIN);
//        List<HocSinhDTO> hs = mongoService.getAllStudents();
//        LopHocDTO lop = mongoService.getLopHocById("52a1429344ae1dabcd60b2bc");
//        lop.setlistHocSinh(hs);
//        mongoService.updateLopHoc(lop);
//        
//        LopHocDTO lop1 = mongoService.getLopHocById("52a1429344ae1dabcd60b2bc");
//        System.out.println(lop1.gettenLopHoc());
//        System.out.println(lop1.getlistHocSinh().size());
//        List<HocSinhDTO> hs = mongoService.getAllStudents();
//        LopHocDTO lop = mongoService.getLopHocById("52a1429344ae1dabcd60b2bc");
//        lop.setlistHocSinh(hs);
      
//        List<HocSinhDTO> listHocSinh = lop.getlistHocSinh();
//        
//        System.out.print(listHocSinh.size());
        
//        Map<String, Object> map = new HashMap<String, Object>();
//        List<ChiTietChuyenMonDTO> listChuyenMon = mongoService.getListChiTietChuyenMonByIdGiaoVien("52a0aa8d44aeb4910f530db8");
//        List<PhanCongDTO> listPhanCong = new ArrayList<PhanCongDTO>();
//        
//        for(int i = 0; i < listChuyenMon.size(); i++) {
//            List<PhanCongDTO> listTemp = mongoService.getListPhanCongBy(listChuyenMon.get(i).getid());
//            listPhanCong.addAll(listTemp);
//            
//        }
//        
//        System.out.print(listPhanCong.size());
//        System.out.print("End");
//        List<ChiTietChuyenMonDTO> ctcm = mongoService.getAllChiTietChuyenMon();
//        List<LopHocDTO> lop = mongoService.getAllLopHoc();
//        
//        PhanCongDTO p = new PhanCongDTO();
//        p.setChiTietChuyenMon(ctcm.get(0));
//        p.setLopHoc(lop.get(0));
//        p.setMota("Mo ta choi");
//        
//        mongoService.insertPhanCong(p);
//        List<GiaoVienDTO> gv = mongoService.getAllgiaoVien();
//        List<ChiTietMonHocDTO> ct = mongoService.getAllChiTietMonHoc();
//        
//        ChiTietChuyenMonDTO ctcm = new ChiTietChuyenMonDTO();
//        ctcm.setChiTietMonHoc(ct.get(0));
//        ctcm.setGiaoVien(gv.get(0));
//        ctcm.setMota("Mo ta choi");
//        
//        mongoService.insertChiTietChuyenMon(ctcm);
//        List<MonHocDTO> mon = mongoService.getAllMonHoc();
//        List<KhoiLopDTO> khoi = mongoService.getAllkhoiLop();
//        
//        ChiTietMonHocDTO chitietmonhoc = new ChiTietMonHocDTO();
//        chitietmonhoc.setKhoiLop(khoi.get(0));
//        chitietmonhoc.setMonHoc(mon.get(0));
//        
//        mongoService.insertChiTietMonHoc(chitietmonhoc);
//        //////////
//        GiaoVienDTO giaoVien = new GiaoVienDTO();
//        giaoVien.sethoTen("Vu Van Ly");
//        mongoService.insertgiaoVien(giaoVien);
//        /////////////
//        NamHocDTO namHoc = new NamHocDTO();
//        namHoc.settennamHoc("2012");
//        mongoService.insertnamHoc(namHoc);
//        ////////////
//        KhoiLopDTO khoiLop = new KhoiLopDTO();
//        khoiLop.settenkhoiLop("Khoi 2");
//        mongoService.insertkhoiLop(khoiLop);
//        //////////////
//        HocSinhDTO hocsinh = new HocSinhDTO();
//        hocsinh.sethoTen("Tran Le Tuan");
//        mongoService.insertStudent(hocsinh);
//        HocSinhDTO hocsinh1 = new HocSinhDTO();
//        hocsinh1.sethoTen("Tran Le Tuan1");
//        mongoService.insertStudent(hocsinh1);
//        ///////////////
//        LopHocDTO lophoc = new LopHocDTO();
//        lophoc.settenLopHoc("2/2");
//        lophoc.setgiaoVien(giaoVien);
//        lophoc.setnamHoc(namHoc);
//        lophoc.setkhoiLop(khoiLop);
//        lophoc.setlistHocSinh(new ArrayList<HocSinhDTO>());
//        lophoc.getlistHocSinh().add(hocsinh);
//        lophoc.getlistHocSinh().add(hocsinh1);      
//        mongoService.insertLopHoc(lophoc);
//<editor-fold defaultstate="collapsed" desc="comment">
                /// insert khoi lop
//                 KhoiLopDTO khoilop = new KhoiLopDTO();
//                 khoilop.setTenKhoiLop("Grade 3");
//                 mongoService.insertKhoiLop(khoilop);
//                 // insert nam hoc
//                 NamHocDTO namhoc = new NamHocDTO();
//                 namhoc.setTenNamHoc("2013-2014");
//                 mongoService.insertNamHoc(namhoc);
//                 // insert giao vien
//                 GiaoVienDTO giaovien = new GiaoVienDTO();
//                 giaovien.setHoTen("Vu Van Ly");
//                 mongoService.insertGiaoVien(giaovien);
//                 // insert hoc sinh
//                 HocSinhDTO hocsinh = new HocSinhDTO();
//                 hocsinh.setHoTen("aaaaaa");
//                 HocSinhDTO hocsinh1 = new HocSinhDTO();
//                 hocsinh1.setHoTen("aaaaaa");
//                 HocSinhDTO hocsinh2 = new HocSinhDTO();
//                 hocsinh2.setHoTen("aaaaaa");
//                 mongoService.insertStudent(hocsinh);
//                 mongoService.insertStudent(hocsinh1);
//                 mongoService.insertStudent(hocsinh2);
//                 // insert lop hoc
//                 LopHocDTO lophoc = new LopHocDTO();
//                 lophoc.setTenLopHoc("Class 2/3");
//                 lophoc.setKhoiLop(khoilop);
//                 lophoc.setNamHoc(namhoc);
//                 lophoc.setGiaoVien(giaovien);
//                 lophoc.setListHocSinh(new ArrayList<HocSinhDTO>());
//                 lophoc.getListHocSinh().add(hocsinh);
//                 lophoc.getListHocSinh().add(hocsinh1);
//                 lophoc.getListHocSinh().add(hocsinh2);
//                 mongoService.insertLopHoc(lophoc);
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="comment">
//        List<LopHocDTO> listlophoc = new ArrayList<LopHocDTO>();
//        listlophoc = mongoService.getAllLopHoc();
//        for (int i = 0; i < listlophoc.size(); i++) {
//            LopHocDTO lophoc = listlophoc.get(i);
//            System.out.println(lophoc.getTenLopHoc() + "-"
//                    + lophoc.getKhoiLop().getTenKhoiLop() + "-"
//                    + lophoc.getNamHoc().getTenNamHoc());
//            List<HocSinhDTO> list = lophoc.getListHocSinh();
//            if (list != null)
//            for (int j = 0; j < list.size(); j++) {
//                System.out.println(list.get(j).getHoTen());
//            }
//        }
//</editor-fold>
    }
}
