package com.mycompany.doggrooming.logic;

import com.mycompany.doggrooming.logic.Owner;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-22T19:51:50", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Pet.class)
public class Pet_ { 

    public static volatile SingularAttribute<Pet, String> allergic;
    public static volatile SingularAttribute<Pet, String> race;
    public static volatile SingularAttribute<Pet, String> color;
    public static volatile SingularAttribute<Pet, String> observation;
    public static volatile SingularAttribute<Pet, Owner> oneOwner;
    public static volatile SingularAttribute<Pet, String> name;
    public static volatile SingularAttribute<Pet, Integer> num_client;
    public static volatile SingularAttribute<Pet, String> special_attention;

}