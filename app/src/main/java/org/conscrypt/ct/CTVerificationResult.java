package org.conscrypt.ct;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.ct.VerifiedSCT;

/* JADX INFO: loaded from: classes4.dex */
public class CTVerificationResult {
    private final ArrayList<VerifiedSCT> validSCTs = new ArrayList<>();
    private final ArrayList<VerifiedSCT> invalidSCTs = new ArrayList<>();

    public void add(VerifiedSCT verifiedSCT) {
        if (verifiedSCT.status == VerifiedSCT.Status.VALID) {
            this.validSCTs.add(verifiedSCT);
        } else {
            this.invalidSCTs.add(verifiedSCT);
        }
    }

    public List<VerifiedSCT> getInvalidSCTs() {
        return DesugarCollections.unmodifiableList(this.invalidSCTs);
    }

    public List<VerifiedSCT> getValidSCTs() {
        return DesugarCollections.unmodifiableList(this.validSCTs);
    }
}
