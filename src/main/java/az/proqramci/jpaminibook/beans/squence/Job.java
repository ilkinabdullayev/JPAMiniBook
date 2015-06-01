/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.proqramci.jpaminibook.beans.squence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 *
 * @author Ilkin Abdullayev
 */
@Entity
@Table(name = "JOB")
public class Job {

    @Id   
    @TableGenerator(name = "TABLE_GENERATOR", table = "ID_TABLE", pkColumnName = "ID_TABLE_NAME", pkColumnValue = "PERSON_ID", valueColumnName = "ID_TABLE_VALUE",allocationSize = 15)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GENERATOR")
    private int id;

    private String name;

    public Job() {
    }

    public Job(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Job other = (Job) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Job{" + "id=" + id + ", name=" + name + '}';
    }

}
