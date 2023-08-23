/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabigdecimal;
 import java.math.BigDecimal;
/**
 *
 * @author Anny Yohana
 */
public class CuentaBigDecimal {
  
  private String nombre;
  private BigDecimal saldo;
  
  public CuentaBigDecimal(String nombre) {
    this.nombre = nombre;
    this.saldo = BigDecimal.ZERO;
  }
  
  public void establecerNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String obtenerNombre() {
    return nombre;
  }
  
  public BigDecimal obtenerSaldo() {
    return saldo;
  }
  
  public void depositar(BigDecimal monto) {
    saldo = saldo.add(monto);
  }
  
  public void retirar(BigDecimal monto) {
    if (monto.compareTo(saldo) <= 0) {
      saldo = saldo.subtract(monto);
    } else {
      System.out.println("No hay saldo suficiente para retirar esa cantidad.");
    }
  }
}
