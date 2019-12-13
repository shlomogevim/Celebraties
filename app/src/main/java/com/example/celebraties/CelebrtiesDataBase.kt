package com.example.celebraties

class CelebrtiesDataBase:ArrayList<Celebrity> {

     var celList:ArrayList<Celebrity>? = null

    constructor(){
        celList= ArrayList()
            celList?.add(Celebrity("Angilina Goli","American Actor",R.drawable.angelina_jolie,true))
            celList?.add(Celebrity("Henfy Hoobran","British Actor",R.drawable.audrey_hepburn,false))
            celList?.add(Celebrity("Bread Pitt","British Actor",R.drawable.brad_pitt,true))
            celList?.add(Celebrity("Elizabet Taylor","British Actor",R.drawable.elizabeth_taylor,false))
            celList?.add(Celebrity("Ingread Bergman","British Actor",R.drawable.ingrid_bergman,false))
            celList?.add(Celebrity("Jeams Stuart","British Actor",R.drawable.james_stewart,true))
            celList?.add(Celebrity("Marlin Monro","British Actor",R.drawable.marilyn_monroe,false))
         }


}