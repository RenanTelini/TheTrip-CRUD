import React from "react";

export default function Promocoes(){
    return (
        <>
            <br/>
            <button type="button" id="btnCriar">Criar nova promoção</button>
            <table class="table" id="tabela">
            <thead>
                <tr>
                    <th id="tituloTabela">
                        Valores promocionais
                    </th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td id="valor">
                        R$ 900,75
                    </td>
                    <td id="valor">
                        <button type="button" id="btnEditar">Editar</button> |
                        <button type="button" id="btnDetalhes">Detalhes</button> |
                        <button type="button" id="btnDeletar">Deletar</button>
                    </td>
                </tr>
                <tr>
                    <td id="valor">
                        R$ 1350,95
                    </td>
                    <td id="valor">
                        <button type="button" id="btnEditar">Editar</button> |
                        <button type="button" id="btnDetalhes">Detalhes</button> |
                        <button type="button" id="btnDeletar">Deletar</button>
                    </td>
                </tr>
                <tr>
                    <td id="valor">
                        R$ 215,10
                    </td>
                    <td id="valor">
                        <button type="button" id="btnEditar">Editar</button> |
                        <button type="button" id="btnDetalhes">Detalhes</button> |
                        <button type="button" id="btnDeletar">Deletar</button>
                    </td>
                </tr>
            </tbody>
        </table>  
        </>
    )
}