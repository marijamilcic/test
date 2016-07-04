/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.poslovnipartner;

import db.DatabaseBroker;
import domen.PoslovniPartner;
import so.OpstaSO;

/**
 *
 * @author student1
 */
public class SacuvajPoslovnogPartneraSO extends OpstaSO {

    @Override
    protected void proveriPreduslov(Object obj) throws Exception {
        // Proveriti preduslov sistemske operacije
    }

    @Override
    protected void izvrsiKonkretnuSO(Object obj) throws Exception {
        DatabaseBroker.getInstance().sacuvaj((PoslovniPartner) obj);
    }

}
