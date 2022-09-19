package ru.inline.armcheck.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Workstation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String cabinetNumber;

    private String fullNameEmployee;

    private LocalDate checkDate;

    private TypePC type;

    private String inventoryNumber;

    private String networkHostName; // имя узла в сети

    private String ipAddress;

    @ManyToOne
    @JoinColumn(name = "operation_system_id")
    private OperationSystem operationSystem;

    private String sealNumber; // номер пломбы

    private Boolean isBiosPasswordChanged;

    private Boolean hasAdministratorAuthority;

    private String cryptoProLicense;

    private Boolean hasKesl;

    private Boolean hasSns;

    private Boolean hasAssistant;

    private Boolean hasConsultant;

    private Boolean hasUnauthorizedSoftware;

    private String note;
}
