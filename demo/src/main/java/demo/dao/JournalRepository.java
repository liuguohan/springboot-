package demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long> {

}
