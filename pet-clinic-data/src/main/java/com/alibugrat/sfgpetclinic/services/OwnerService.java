package com.alibugrat.sfgpetclinic.services;

import com.alibugrat.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
