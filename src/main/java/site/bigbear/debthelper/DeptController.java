package site.bigbear.debthelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.bigbear.debthelper.model.Debt;
import site.bigbear.debthelper.service.DebtService;

@RestController
@RequestMapping("/api/v1/debt")
public class DeptController {
    @Autowired
    private DebtService debtService;

    public ResponseEntity<Debt> create(@RequestBody Debt debt){
        return ResponseEntity.ok(this.debtService.save(debt));
    }

}
