package agentBackend.repository;

import agentBackend.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository  extends JpaRepository<Report, Long> {
}
