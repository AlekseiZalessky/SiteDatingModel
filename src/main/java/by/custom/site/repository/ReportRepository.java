package by.custom.site.repository;

import by.custom.site.models.Report;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Setter
@Getter
public class ReportRepository {
    private Map<String, Set<Report>> userReports = new HashMap<>();
}
