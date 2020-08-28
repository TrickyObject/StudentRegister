package mts.student.business;

import mts.student.dao.StudentRegisterDao;
import mts.student.view.StudentRequest;
import mts.student.view.StudentResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


public class StudentRegisterManager {

    private static final Logger logger = LoggerFactory.getLogger(StudentRegisterManager.class);

    private static final String HQL_STUDENT_REQUEST = "select st.studentId from Student st, StudentDocument std, Faculty f, University u " +
            "where st.id = std.student " +
            "and std.university = u.id " +
            "and std.faculty = f.id " +

            "and st.firstName = ?1 " +
            "and st.surName = ?2 " +
            "and st.patronymicName = ?3 " +
            "and st.dateOfBirth = ?4 " +
            "and st.passportSerial = ?5 " +
            "and st.passportNumber = ?6 " +
            "and st.passportDate = ?7 ";
//            "and std.faculty = ?11 " + "and std.studentForm = ?12 ";


    private StudentRegisterDao studentRegisterDao;

    public StudentRegisterManager() {

        logger.info("======> Инициализация DAO.. ");
        studentRegisterDao = new StudentRegisterDao();
    }

    public StudentResponse findStudent(StudentRequest request) {

        logger.info("findStudent..");

        EntityManager em = getEntityManager();
        StudentResponse response = new StudentResponse();

        String hql = HQL_STUDENT_REQUEST;

        Query query = em.createQuery(hql);
        setStudentParam(query, request);

        List resultList = query.getResultList();

        logger.info("Result List: " +resultList.toString());

        if (resultList.size() == 1) {
            response.setStudying(true);
        }

        em.close();

        logger.info("Ответ: " + response.isStudying());

        return response;
    }


    private Query setStudentParam(Query query, StudentRequest request) {

        int count = 1;

        logger.info("setStudentParam");

        logger.info(String.valueOf(count));
        query.setParameter(count++, request.getFirstName());
        logger.info(String.valueOf(count));
        query.setParameter(count++, request.getSurName());
        logger.info(String.valueOf(count));
        query.setParameter(count++, request.getPatronymicName());
        logger.info(String.valueOf(count));
        query.setParameter(count++, request.getDateOfBirth());
        logger.info(String.valueOf(count));
        query.setParameter(count++, request.getPassportSerial());
        logger.info(String.valueOf(count));
        query.setParameter(count++, request.getPassportNumber());
        logger.info(String.valueOf(count));
        query.setParameter(count++, request.getPassportDate());
//        logger.info(String.valueOf(count));
//        query.setParameter(count++, request.getDocumentNumber());
//        logger.info(String.valueOf(count));
//        query.setParameter(count++, request.getDocumentDate());

        logger.info("setStudentParam: "
                + request.getFirstName() + " "
                + request.getSurName() + " "
                + request.getPatronymicName() + " "
                + request.getDateOfBirth() + " "
                + request.getPassportSerial() + " "
                + request.getPassportNumber() + " "
                + request.getPassportDate() + " "
                + request.getDocumentNumber() + " "
                + request.getDocumentDate() + " "

        );

        return query;
    }


    private EntityManager getEntityManager() {
        return studentRegisterDao.getEntityManager();
    }

}
