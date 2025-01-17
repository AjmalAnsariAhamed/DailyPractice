package com.Collection;

import java.util.Objects;

public class OnePiece {
    private String name;
    private boolean devilFruit;
    private boolean Haki;
    private String HakiType=null;
    private String devilFruitType=null;
    OnePiece(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDevilFruit() {
        return devilFruit;
    }

    public void setDevilFruit(boolean devilFruit) {
        this.devilFruit = devilFruit;
    }

    public boolean isHaki() {
        return Haki;
    }

    public void setHaki(boolean haki) {
        Haki = haki;
    }

    public String getHakiType() {
        return HakiType;
    }

    public void setHakiType(String hakiType) {
        HakiType = hakiType;
    }

    public String getDevilFruitType() {
        return devilFruitType;
    }

    public void setDevilFruitType(String devilFruitType) {
        this.devilFruitType = devilFruitType;
    }

    OnePiece(String name, String devilFruitType, boolean devilFruit){
      this.name=name;
      this.devilFruit=devilFruit;
      this.devilFruitType=devilFruitType;
    }
    OnePiece(String name, boolean Haki,String HakiType){
this.name=name;
this.Haki=Haki;
this.HakiType=HakiType;
    }
    @Override
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(obj==this){
            return true;
        }
        if(getClass()==obj.getClass()){
            return false;
        }
        OnePiece other=(OnePiece)obj;
        return Objects.equals(this.name,((OnePiece) obj).getName());


    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public String toString(){
        if(devilFruitType==null){
            return String.format("name : [%s], Haki type: [%s] \n",this.name,this.HakiType);
        }
        return String.format("name : [%s], Devil Fruit type: [%s] \n",this.name,this.devilFruitType);

    }
}
