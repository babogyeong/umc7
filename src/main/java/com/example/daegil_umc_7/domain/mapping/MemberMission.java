package com.example.daegil_umc_7.domain.mapping;

import com.example.daegil_umc_7.domain.common.BaseEntity;
import com.example.daegil_umc_7.domain.enums.MissionStatus;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberMission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private MissionStatus status;
}
