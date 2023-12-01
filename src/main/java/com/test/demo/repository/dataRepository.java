package com.test.demo.repository;

import com.test.demo.model.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface dataRepository extends JpaRepository<data,Long> {
    // Custom query methods if needed
    @Query(nativeQuery = true, value="select a.mdn, a.product,IFNULL(b.voice, 0) as voice,IFNULL(c.sms, 0) as sms from subscribers a left join (select count(type) as voice, substring(mdn,2,11) as number from cdrs where type='VOICE' group by number order by number) as b on a.mdn = b.number left join (select count(type) as sms, substring(mdn,2,11) as number from cdrs where type='SMS' group by number order by number) as c on a.mdn = c.number where a.product = 'PROD1'")
    public List<data> getAllNumbers();
}